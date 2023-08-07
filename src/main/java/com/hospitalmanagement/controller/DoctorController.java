package com.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospitalmanagement.dao.DoctorDAO;
import com.hospitalmanagement.entity.Doctor;

/**
 * Controller for Doctor
 * 
 * @author Nishant
 *
 */
@Controller
public class DoctorController {

	@Autowired
	private DoctorDAO doctorDAO;

	/**
	 * Doctor Registration form
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/create-doctor")
	public String createDoctor(Model model) {
		List<Doctor> doctors = doctorDAO.selectAllDoctors();
		doctors.forEach(doctor -> System.out.println(doctor));

		model.addAttribute("doctor", new Doctor());

		return "create-doctor";
	}

	/**
	 * Form submission
	 * @param doctor
	 * @return
	 */
	@PostMapping("/submit-doctor")
	public String submitDoctor(Doctor doctor) {
		doctorDAO.insertDoctor(doctor);
		System.out.println("Insert Success");
		return "redirect:/show-doctors";
	}

	/**
	 * Shows Doctor in Table
	 * @param model
	 * @return
	 */
	@GetMapping("/show-doctors")
	public String showDoctors(Model model) {
		List<Doctor> doctors = doctorDAO.selectAllDoctors();
		System.out.println(doctors);
		model.addAttribute("doctors", doctors);
		return "show-doctors";
	}

	/**
	 * Updates form
	 * @param id
	 * @param model
	 * @return
	 */
	@GetMapping("/update-doctor")
	public String updateDoctor(@RequestParam("id") int id, Model model) {
		Doctor doctor = doctorDAO.getDoctorById(id);
		model.addAttribute("doctor", doctor);
		return "update-doctor";
	}

	/**
	 * Updates the Doctor
	 * @param doctor
	 * @return
	 */
	@PostMapping("/update-doctor")
	public String updateDoctor(Doctor doctor) {
		doctorDAO.updateDoctor(doctor);
		return "redirect:/show-doctors";
	}

	/**
	 * Deletes the doctor
	 * @param id
	 * @return
	 */
	@GetMapping("/delete-doctor")
	public String deleteDoctor(@RequestParam("id") int id) {
		doctorDAO.deleteDoctor(id);
		return "redirect:/show-doctors";
	}
}
