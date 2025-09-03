package com.gtel.SpringBoot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class School {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany(mappedBy = "school")
    private List<Student> students;
}
