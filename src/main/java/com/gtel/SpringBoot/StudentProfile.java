package com.gtel.SpringBoot;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class StudentProfile {
    @Id
    @GeneratedValue
    private int id;

    private String bio;

    @OneToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;
}
