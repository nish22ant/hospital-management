package com.hospitalmanagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.entity.Doctor;

/**
 * Implementation of the DoctorDAO interface that provides data access methods
 * for managing Doctor entities in the database.
 *
 * @author: Nishant
 */
@SuppressWarnings("deprecation")
@Repository
public class DoctorDAOImpl implements DoctorDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private RowMapper<Doctor> doctorRowMapper;

    /**
     * Retrieves a list of all doctors from the database.
     *
     * @return A List containing Doctor objects representing all doctors.
     */
    @Override
    public List<Doctor> selectAllDoctors() {
        String sql = "SELECT * FROM Doctor";
        return jdbcTemplate.query(sql, doctorRowMapper);
    }

    /**
     * Inserts a new doctor record into the database.
     *
     * @param doctor The Doctor object to be inserted.
     * @return The number of rows affected by the insert operation.
     */
    @Override
    public int insertDoctor(Doctor doctor) {
        String sql = "INSERT INTO Doctor (doctor_name, specialization, doctor_email, doctor_phone) " +
                "VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, doctor.getDoctorName(), doctor.getSpecialization(),
                doctor.getDoctorEmail(), doctor.getDoctorPhone());
    }

    /**
     * Updates an existing doctor record in the database.
     *
     * @param doctor The Doctor object containing updated information.
     * @return The number of rows affected by the update operation.
     */
    @Override
    public int updateDoctor(Doctor doctor) {
        String sql = "UPDATE Doctor SET doctor_name = ?, specialization = ?, doctor_email = ?, " +
                "doctor_phone = ? WHERE doctor_id = ?";
        return jdbcTemplate.update(sql, doctor.getDoctorName(), doctor.getSpecialization(),
                doctor.getDoctorEmail(), doctor.getDoctorPhone(), doctor.getDoctorId());
    }

    /**
     * Retrieves a Doctor object from the database based on the given doctor ID.
     *
     * @param id The ID of the doctor to retrieve.
     * @return A Doctor object representing the retrieved doctor, or null if not found.
     */
    @Override
    public Doctor getDoctorById(int id) {
        String sql = "SELECT * FROM Doctor WHERE doctor_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, doctorRowMapper);
    }

    /**
     * Deletes a doctor record from the database based on the given doctor ID.
     *
     * @param id The ID of the doctor to be deleted.
     * @return The number of rows affected by the delete operation.
     */
    @Override
    public int deleteDoctor(int id) {
        String sql = "DELETE FROM Doctor WHERE doctor_id = ?";
        return jdbcTemplate.update(sql, id);
    }

    /**
     * Returns the author of this class.
     *
     * @return The name of the author of this class.
     */
    public String getAuthor() {
        return "Nishant";
    }
}
