package com.gtel.SpringBoot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findAllByFirstNameContaining(String firstName);

    public void deleteByLastNameIs(String lastName);


}
