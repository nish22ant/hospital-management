package com.hospitalmanagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.entity.Staff;

/**
 * DAO implementation for managing Staff entities in the database.
 * This class provides methods for selecting, inserting, updating, and deleting staff records.
 *
 * @author: Nishant
 */
@Repository
public class StaffDAOImpl implements StaffDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private RowMapper<Staff> staffRowMapper;

    /**
     * Retrieves a list of all staff members from the database.
     *
     * @return A List containing Staff objects representing all staff members.
     */
    @Override
    public List<Staff> selectAllStaff() {
        String sql = "SELECT * FROM staff";
        return jdbcTemplate.query(sql, staffRowMapper);
    }

    /**
     * Inserts a new staff member record into the database.
     *
     * @param staff The Staff object to be inserted.
     * @return The number of rows affected by the insert operation.
     */
    @Override
    public int insertStaff(Staff staff) {
        String sql = "INSERT INTO staff (staff_name, staff_role, staff_email, staff_phone) " +
                "VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, staff.getStaffName(), staff.getStaffRole(), staff.getStaffEmail(),
                staff.getStaffPhone());
    }

    /**
     * Updates an existing staff member record in the database.
     *
     * @param staff The Staff object containing updated information.
     * @return The number of rows affected by the update operation.
     */
    @Override
    public int updateStaff(Staff staff) {
        String sql = "UPDATE staff SET staff_name = ?, staff_role = ?, staff_email = ?, staff_phone = ? " +
                "WHERE staff_id = ?";
        return jdbcTemplate.update(sql, staff.getStaffName(), staff.getStaffRole(), staff.getStaffEmail(),
                staff.getStaffPhone(), staff.getStaffId());
    }

    /**
     * Retrieves a Staff object from the database based on the given staff ID.
     *
     * @param id The ID of the staff member to retrieve.
     * @return A Staff object representing the retrieved staff member, or null if not found.
     */
    @Override
    public Staff getStaffById(int id) {
        String sql = "SELECT * FROM staff WHERE staff_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, staffRowMapper);
    }

    /**
     * Deletes a staff member record from the database based on the given staff ID.
     *
     * @param id The ID of the staff member to be deleted.
     * @return The number of rows affected by the delete operation.
     */
    @Override
    public int deleteStaff(int id) {
        String sql = "DELETE FROM staff WHERE staff_id = ?";
        return jdbcTemplate.update(sql, id);
    }
}
