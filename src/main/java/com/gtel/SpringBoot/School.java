package com.gtel.SpringBoot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class School {
    @Id
    @GeneratedValue
    private int id;

    private String name;
}
