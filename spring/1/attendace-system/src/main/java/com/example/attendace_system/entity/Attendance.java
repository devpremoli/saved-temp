package com.example.attendace_system.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_id")
    private long attendanceId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "attendance_date", nullable = false)
    private LocalDate date;

    @Column(name = "in_time", nullable = false)
    private LocalDateTime inTime;

    @Column(name = "out_time", nullable = false)
    private LocalDateTime outTime;

    @Column(name = "signature")
    private String signature;

    public Attendance() {}

    public Attendance(User user, LocalDate date, LocalDateTime inTime, LocalDateTime outTime, String signature) {
        this.user = user;
        this.date = date;
        this.inTime = inTime;
        this.outTime = outTime;
        this.signature = signature;
    }

    // Getters and Setters
    public long getAttendanceId() { return attendanceId; }
    public void setAttendanceId(long attendanceId) { this.attendanceId = attendanceId; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    public LocalDateTime getInTime() { return inTime; }
    public void setInTime(LocalDateTime inTime) { this.inTime = inTime; }
    public LocalDateTime getOutTime() { return outTime; }
    public void setOutTime(LocalDateTime outTime) { this.outTime = outTime; }
    public String getSignature() { return signature; }
    public void setSignature(String signature) { this.signature = signature; }
}


