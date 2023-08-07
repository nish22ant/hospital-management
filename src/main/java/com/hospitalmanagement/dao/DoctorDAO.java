package com.hospitalmanagement.dao;

import java.util.List;

import com.hospitalmanagement.entity.Doctor;

public interface DoctorDAO {
    List<Doctor> selectAllDoctors();
    int insertDoctor(Doctor doctor);
    int updateDoctor(Doctor doctor);
    Doctor getDoctorById(int id);
    int deleteDoctor(int id);
}
