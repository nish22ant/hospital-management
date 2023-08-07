package com.hospitalmanagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.entity.Patient;

/**
 * DAO implementation for managing Patient entities in the database.
 * This class provides methods for selecting, inserting, updating, and deleting patient records.
 *
 * @author Nishant
 */
@Repository
public class PatientDAOImpl implements PatientDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private RowMapper<Patient> patientRowMapper;

    /**
     * Retrieves a list of all patients from the database.
     *
     * @return A List containing Patient objects representing all patients.
     */
    @Override
    public List<Patient> selectAllPatients() {
        String sql = "SELECT * FROM patient";
        return jdbcTemplate.query(sql, patientRowMapper);
    }

    /**
     * Inserts a new patient record into the database.
     *
     * @param patient The Patient object to be inserted.
     * @return The number of rows affected by the insert operation.
     */
    @Override
    public int insertPatient(Patient patient) {
        String sql = "INSERT INTO patient (patient_name, gender, patient_email, patient_phone) " +
                "VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, patient.getPatientName(), patient.getGender(), patient.getPatientEmail(),
                patient.getPatientPhone());
    }

    /**
     * Updates an existing patient record in the database.
     *
     * @param patient The Patient object containing updated information.
     * @return The number of rows affected by the update operation.
     */
    @Override
    public int updatePatient(Patient patient) {
        String sql = "UPDATE patient SET patient_name = ?, gender = ?, patient_email = ?, patient_phone = ? " +
                "WHERE patient_id = ?";
        return jdbcTemplate.update(sql, patient.getPatientName(), patient.getGender(), patient.getPatientEmail(),
                patient.getPatientPhone(), patient.getPatientId());
    }

    /**
     * Retrieves a Patient object from the database based on the given patient ID.
     *
     * @param id The ID of the patient to retrieve.
     * @return A Patient object representing the retrieved patient, or null if not found.
     */
    @Override
    public Patient getPatientById(int id) {
        String sql = "SELECT * FROM patient WHERE patient_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, patientRowMapper);
    }

    /**
     * Deletes a patient record from the database based on the given patient ID.
     *
     * @param id The ID of the patient to be deleted.
     * @return The number of rows affected by the delete operation.
     */
    @Override
    public int deletePatient(int id) {
        String sql = "DELETE FROM patient WHERE patient_id = ?";
        return jdbcTemplate.update(sql, id);
    }
}
