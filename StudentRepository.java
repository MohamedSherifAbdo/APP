package com.sherif.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sherif.rest.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
