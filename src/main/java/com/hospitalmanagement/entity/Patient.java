package com.hospitalmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents a patient in the hospital management system.
 * Each patient has a unique identifier (ID), name, gender,
 * email address, and phone number.
 *
 * @author: Nishant
 */
@Entity
@Table(name = "Patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private int patientId;

    @Column(name = "patient_name", nullable = false)
    private String patientName;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "patient_email", nullable = false)
    private String patientEmail;

    @Column(name = "patient_phone", nullable = false)
    private String patientPhone;

    public Patient() {
    }

    public Patient(int patientId, String patientName, String gender, String patientEmail, String patientPhone) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.gender = gender;
        this.patientEmail = patientEmail;
        this.patientPhone = patientPhone;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }
}
