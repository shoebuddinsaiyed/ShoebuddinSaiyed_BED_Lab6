package com.grtlrn.CollgeFestManagement.service;

import java.util.List;

import com.grtlrn.CollgeFestManagement.Entity.Student;

public interface StudentService {
	public List<Student> findAll();

	public Student findbyId(int id);

	public void save(Student theStudent);

	public void deleteByid(int id);
}
