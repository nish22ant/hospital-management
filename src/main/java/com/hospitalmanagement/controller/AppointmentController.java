package com.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospitalmanagement.dao.AppointmentDAO;
import com.hospitalmanagement.entity.Appointment;
/***
 * Appointment Controller
 * @author Nishant
 *
 */
@Controller
public class AppointmentController {
	
	@Autowired
	private AppointmentDAO appointmentDAO;
	/**
	 * Show the Registeration Form
	 * @param model
	 * @return
	 */
	@GetMapping("/register")
	public String register(Model model) {
		List<Appointment> selectAllAppointment = appointmentDAO.selectAllAppointment();
		selectAllAppointment.forEach(app -> System.out.println(app));
		
		model.addAttribute("appointment", new Appointment());
		
		return "registeration";
	}
	/**
	 * Inserts data on form submission
	 * @param appointment
	 * @return
	 */
	@PostMapping("/submit-appointment")
	public String submitAppointment(Appointment appointment) {
		appointmentDAO.insertAppointment(appointment);
		System.out.println("InsertSuccess");
		return "redirect:/show-registerations";
	}
	
	/**
	 * Show all data in tabular form
	 * @param model
	 * @return
	 */
	@GetMapping("/show-registerations")
	public String showAppointments(Model model) {
		List<Appointment> appointments = appointmentDAO.selectAllAppointment();
		System.out.println(appointments);
		model.addAttribute("appointments", appointments);
		return "show-appointments";
	}
	/**
	 * Form for updating the appointment data
	 * @param id
	 * @param model
	 * @return
	 */
	@GetMapping("/update-appointment")
	public String update(@RequestParam("id") int id, Model model) {
	    Appointment appointment = appointmentDAO.getAppointmentById(id);
	    model.addAttribute("appointment", appointment);
	    return "update-appointment";
	}

	/**
	 * Updates the form data
	 * @param appointment
	 * @return
	 */
	@PostMapping("/update-app")
	public String updateAppointment(Appointment appointment) {
		appointmentDAO.updateAppointment(appointment);
		return "redirect:/show-registerations";
	}
	/**
	 * Deletes the Appointment data
	 * @param id
	 * @return
	 */
	@GetMapping("/delete-appointment")
	public String deleteAppointment(@RequestParam("id") int id) {
	    appointmentDAO.deleteAppointment(id);
	    return "redirect:/show-registerations";
	}

}
