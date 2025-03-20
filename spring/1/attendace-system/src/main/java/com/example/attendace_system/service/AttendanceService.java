package com.example.attendace_system.service;

import com.example.attendace_system.entity.Attendance;
import com.example.attendace_system.entity.User;
import com.example.attendace_system.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class AttendanceService {

    private final AttendanceRepository attendanceRepository;

    @Autowired
    public AttendanceService(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    public Attendance logAttendance(User user, LocalDate date, LocalDateTime inTime, LocalDateTime outTime, String signature) {
        Attendance attendance = new Attendance(user, date, inTime, outTime, signature);
        return attendanceRepository.save(attendance);
    }

    public List<Attendance> getAttendanceByUser(User user) {
        return attendanceRepository.findByUser(user);
    }

    public List<Attendance> getAttendanceByUserAndDate(User user, LocalDate date) {
        return attendanceRepository.findByUserAndDate(user, date);
    }
}
