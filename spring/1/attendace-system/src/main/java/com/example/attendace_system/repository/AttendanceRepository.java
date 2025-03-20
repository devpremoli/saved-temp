package com.example.attendace_system.repository;

import com.example.attendace_system.entity.Attendance;
import com.example.attendace_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
    // Find all attendance records for a given user
    List<Attendance> findByUser(User user);

    // Find all attendance records for a given user on a specific date
    List<Attendance> findByUserAndDate(User user, LocalDate date);

}
