package com.hospitalmanagement.dao;

import java.util.List;

import com.hospitalmanagement.entity.Patient;

public interface PatientDAO {
    List<Patient> selectAllPatients();
    int insertPatient(Patient patient);
    int updatePatient(Patient patient);
    Patient getPatientById(int id);
    int deletePatient(int id);
}
