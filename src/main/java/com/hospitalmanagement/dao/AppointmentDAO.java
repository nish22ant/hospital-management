package com.hospitalmanagement.dao;

import java.util.List;

import com.hospitalmanagement.entity.Appointment;

public interface AppointmentDAO {
	List<Appointment> selectAllAppointment();
	int insertAppointment(Appointment appointment);
	int updateAppointment(Appointment appointment);
	Appointment getAppointmentById(int id);
	int deleteAppointment(int id);
}
