package com.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospitalmanagement.dao.PatientDAO;
import com.hospitalmanagement.entity.Patient;
/**
 * Patient Controller to manage Patients
 * @author Nishant
 *
 */
@Controller
public class PatientController {

	@Autowired
	private PatientDAO patientDAO;

	@GetMapping("/create-patient")
	public String createPatient(Model model) {
		List<Patient> patients = patientDAO.selectAllPatients();
		patients.forEach(patient -> System.out.println(patient));

		model.addAttribute("patient", new Patient());

		return "create-patient";
	}

	@PostMapping("/submit-patient")
	public String submitPatient(Patient patient) {
		patientDAO.insertPatient(patient);
		System.out.println("Insert Success");
		return "redirect:/show-patients";
	}

	@GetMapping("/show-patients")
	public String showPatients(Model model) {
		List<Patient> patients = patientDAO.selectAllPatients();
		System.out.println(patients);
		model.addAttribute("patients", patients);
		return "show-patients";
	}

	@GetMapping("/update-patient")
	public String updatePatient(@RequestParam("id") int id, Model model) {
		Patient patient = patientDAO.getPatientById(id);
		model.addAttribute("patient", patient);
		return "update-patient";
	}

	@PostMapping("/update-patient")
	public String updatePatient(Patient patient) {
		patientDAO.updatePatient(patient);
		return "redirect:/show-patients";
	}

	@GetMapping("/delete-patient")
	public String deletePatient(@RequestParam("id") int id) {
		patientDAO.deletePatient(id);
		return "redirect:/show-patients";
	}

}