package com.example.attendace_system.controller;

import com.example.attendace_system.entity.User;
import com.example.attendace_system.service.AttendanceService;
import com.example.attendace_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class AttendanceController {
    private final AttendanceService attendanceService;
    private final UserService userService;

    @Autowired
    public AttendanceController( UserService userService, AttendanceService attendanceService) {
        this.userService = userService;
        this.attendanceService = attendanceService;
    }

    @GetMapping("/attendance")
    public String viewAttendance(@AuthenticationPrincipal org.springframework.security.core.userdetails.User loggedInUser, Model model) {
        User user = userService.findByUsername(loggedInUser.getUsername());
        model.addAttribute("attendances", attendanceService.getAttendanceByUser(user));
        return "attendance";
    }

    @PostMapping("/attendance/log")
    public String logAttendance(@AuthenticationPrincipal org.springframework.security.core.userdetails.User loggedInUser) {
        User user = userService.findByUsername(loggedInUser.getUsername());
        LocalDate date = LocalDate.now();
        LocalDateTime inTime = LocalDateTime.now();
        LocalDateTime outTime = inTime.plusHours(8);
        String signature = String.valueOf(user.getFirstName().charAt(0)) + user.getLastName().charAt(0);

        attendanceService.logAttendance(user, date, inTime, outTime, signature);
        return "redirect:/attendance";
    }
}
