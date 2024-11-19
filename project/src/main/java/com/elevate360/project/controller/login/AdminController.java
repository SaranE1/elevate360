package com.elevate360.project.controller.login;

import com.elevate360.project.model.Admin;
import com.elevate360.project.service.login.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class AdminController {

    @Autowired
    private AdminService adminService;

    // Endpoint to add Admin details
    @PostMapping("/addAdmin")
    public String addAdmin(@RequestBody Admin admin) {
        adminService.addAdmin(admin);
        return "Admin added successfully";
    }

    // Endpoint to login as Admin
    @GetMapping("/adminLogin")
    public String loginAdmin(@RequestBody Admin admin) {
        return adminService.loginAdmin(admin.getUsername(), admin.getPassword());
    }
}
