package com.hospitalmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents a staff member in the hospital management system.
 * Each staff member has a unique identifier (ID), name, role,
 * email address, and phone number.
 *
 * @author: Nishant
 */
@Entity
@Table(name = "Staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int staffId;

    private String staffName;
    private String staffRole;
    private String staffEmail;
    private String staffPhone;

    public Staff() {
    }

    public Staff(String staffName, String staffRole, String staffEmail, String staffPhone) {
        this.staffName = staffName;
        this.staffRole = staffRole;
        this.staffEmail = staffEmail;
        this.staffPhone = staffPhone;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffRole() {
        return staffRole;
    }

    public void setStaffRole(String staffRole) {
        this.staffRole = staffRole;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }
}
