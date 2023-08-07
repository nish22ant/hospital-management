package com.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hospitalmanagement.dao.AppointmentDAO;

/**
 * Home Controller
 * @author Nishant
 *
 */
@Controller
public class HomeController {
	
	@Autowired
	private AppointmentDAO appointmentDAO;
	
	@GetMapping("/")
	public String home(Model model) {
		
		return "home";
	}

}
