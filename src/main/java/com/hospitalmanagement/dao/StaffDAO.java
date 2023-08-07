package com.hospitalmanagement.dao;

import java.util.List;

import com.hospitalmanagement.entity.Staff;

public interface StaffDAO {
    List<Staff> selectAllStaff();
    int insertStaff(Staff staff);
    int updateStaff(Staff staff);
    Staff getStaffById(int id);
    int deleteStaff(int id);
}
