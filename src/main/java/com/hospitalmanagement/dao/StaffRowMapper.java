package com.hospitalmanagement.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hospitalmanagement.entity.Staff;

/**
 * RowMapper implementation for mapping Staff entities from ResultSet rows.
 *
 * This class is responsible for mapping database rows to Staff objects.
 * It extracts column values from the ResultSet and populates a Staff object.
 *
 * @author: Nishant
 */
@Component
public class StaffRowMapper implements RowMapper<Staff> {

    @Override
    public Staff mapRow(ResultSet rs, int rowNum) throws SQLException {
        Staff staff = new Staff();
        staff.setStaffId(rs.getInt("staff_id"));
        staff.setStaffName(rs.getString("staff_name"));
        staff.setStaffRole(rs.getString("staff_role"));
        staff.setStaffEmail(rs.getString("staff_email"));
        staff.setStaffPhone(rs.getString("staff_phone"));
        return staff;
    }
}
