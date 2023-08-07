package com.hospitalmanagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.entity.Appointment;

/**
 * DAO layer to perform CRUD Operations for managing Appointment entities in the database.
 * This class provides methods for selecting, inserting, updating, and deleting appointments.
 *
 * @author: Nishant
 */
@SuppressWarnings("deprecation")
@Repository
public class AppointmentDAOImpl implements AppointmentDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private RowMapper<Appointment> appointmentRowMapper;

    /**
     * Retrieves a list of all appointments from the database.
     *
     * @return A List containing Appointment objects representing all appointments.
     */
    @Override
    public List<Appointment> selectAllAppointment() {
        String sql = "SELECT * FROM appointment";
        return jdbcTemplate.query(sql, appointmentRowMapper);
    }

    /**
     * Inserts a new appointment record into the database.
     *
     * @param appointment The Appointment object to be inserted.
     * @return The number of rows affected by the insert operation.
     */
    @Override
    public int insertAppointment(Appointment appointment) {
        String sql = "INSERT INTO appointment (first_name, last_name, age, mobile_number) " + "VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, appointment.getFirstName(), appointment.getLastName(), appointment.getAge(),
                appointment.getMobileNumber());
    }

    /**
     * Updates an existing appointment record in the database.
     *
     * @param appointment The Appointment object containing updated information.
     * @return The number of rows affected by the update operation.
     */
    @Override
    public int updateAppointment(Appointment appointment) {
        String sql = "UPDATE appointment SET first_name = ?, last_name = ?, age = ?, mobile_number = ? "
                + "WHERE appointment_id = ?";
        return jdbcTemplate.update(sql, appointment.getFirstName(), appointment.getLastName(), appointment.getAge(),
                appointment.getMobileNumber(), appointment.getAppointmentId());
    }

    /**
     * Retrieves an Appointment object from the database based on the given appointment ID.
     *
     * @param id The ID of the appointment to retrieve.
     * @return An Appointment object representing the retrieved appointment, or null if not found.
     */
    @Override
    public Appointment getAppointmentById(int id) {
        String sql = "SELECT * FROM appointment WHERE appointment_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[] { id }, appointmentRowMapper);
    }

    /**
     * Deletes an appointment record from the database based on the given appointment ID.
     *
     * @param id The ID of the appointment to be deleted.
     * @return The number of rows affected by the delete operation.
     */
    @Override
    public int deleteAppointment(int id) {
        String sql = "DELETE FROM appointment WHERE appointment_id = ?";
        return jdbcTemplate.update(sql, id);
    }

}
