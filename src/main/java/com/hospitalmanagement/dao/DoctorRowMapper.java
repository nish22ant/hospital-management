package com.hospitalmanagement.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hospitalmanagement.entity.Doctor;

/**
 * RowMapper implementation for mapping Doctor entities from ResultSet rows.
 *
 * This class is responsible for mapping database rows to Doctor objects.
 * It extracts column values from the ResultSet and populates a Doctor object.
 * 
 * @author: Nishant
 */
@Component
public class DoctorRowMapper implements RowMapper<Doctor> {

    @Override
    public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
        Doctor doctor = new Doctor();
        doctor.setDoctorId(rs.getInt("doctor_id"));
        doctor.setDoctorName(rs.getString("doctor_name"));
        doctor.setSpecialization(rs.getString("specialization"));
        doctor.setDoctorEmail(rs.getString("doctor_email"));
        doctor.setDoctorPhone(rs.getString("doctor_phone"));
        return doctor;
    }
}
