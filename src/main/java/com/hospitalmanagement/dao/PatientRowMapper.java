package com.hospitalmanagement.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hospitalmanagement.entity.Patient;

/**
 * RowMapper implementation for mapping Patient entities from ResultSet rows.
 *
 * This class is responsible for mapping database rows to Patient objects.
 * It extracts column values from the ResultSet and populates a Patient object.
 *
 * @author: Nishant
 */
@Component
public class PatientRowMapper implements RowMapper<Patient> {

    @Override
    public Patient mapRow(ResultSet rs, int rowNum) throws SQLException {
        Patient patient = new Patient();
        patient.setPatientId(rs.getInt("patient_id"));
        patient.setPatientName(rs.getString("patient_name"));
        patient.setGender(rs.getString("gender"));
        patient.setPatientEmail(rs.getString("patient_email"));
        patient.setPatientPhone(rs.getString("patient_phone"));
        return patient;
    }
}
