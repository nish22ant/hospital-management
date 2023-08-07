package com.hospitalmanagement.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hospitalmanagement.entity.Appointment;

/**
 * RowMapper implementation for mapping Appointment entities from ResultSet rows.
 *
 * This class is responsible for mapping database rows to Appointment objects.
 * It extracts column values from the ResultSet and populates an Appointment object.
 *
 * @author: Nishant
 */
@Component
public class AppointmentRowMapper implements RowMapper<Appointment> {
    @Override
    public Appointment mapRow(ResultSet rs, int rowNum) throws SQLException {
        Appointment appointment = new Appointment();
        appointment.setAppointmentId(rs.getInt("appointment_id"));
        appointment.setFirstName(rs.getString("first_name"));
        appointment.setLastName(rs.getString("last_name"));
        appointment.setAge(rs.getInt("age"));
        appointment.setMobileNumber(rs.getString("mobile_number"));
        return appointment;
    }
}
