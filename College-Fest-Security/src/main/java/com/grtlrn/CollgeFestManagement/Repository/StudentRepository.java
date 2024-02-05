package com.grtlrn.CollgeFestManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grtlrn.CollgeFestManagement.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
