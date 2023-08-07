package com.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospitalmanagement.dao.StaffDAO;
import com.hospitalmanagement.entity.Staff;
/**
 * Staff Controller to perform CRUD on Staff
 * @author Nishant
 *
 */
@Controller
public class StaffController {

    @Autowired
    private StaffDAO staffDAO;

    @GetMapping("/create-staff")
    public String createStaff(Model model) {
        List<Staff> staffList = staffDAO.selectAllStaff();
        staffList.forEach(staff -> System.out.println(staff));

        model.addAttribute("staff", new Staff());

        return "create-staff";
    }

    @PostMapping("/submit-staff")
    public String submitStaff(Staff staff) {
        staffDAO.insertStaff(staff);
        System.out.println("Insert Success");
        return "redirect:/show-staff";
    }

    @GetMapping("/show-staff")
    public String showStaff(Model model) {
        List<Staff> staffList = staffDAO.selectAllStaff();
        System.out.println(staffList);
        model.addAttribute("staffList", staffList);
        return "show-staff";
    }

    @GetMapping("/update-staff")
    public String updateStaff(@RequestParam("id") int id, Model model) {
        Staff staff = staffDAO.getStaffById(id);
        model.addAttribute("staff", staff);
        return "update-staff";
    }

    @PostMapping("/update-staff")
    public String updateStaff(Staff staff) {
        staffDAO.updateStaff(staff);
        return "redirect:/show-staff";
    }

    @GetMapping("/delete-staff")
    public String deleteStaff(@RequestParam("id") int id) {
        staffDAO.deleteStaff(id);
        return "redirect:/show-staff";
    }

}
