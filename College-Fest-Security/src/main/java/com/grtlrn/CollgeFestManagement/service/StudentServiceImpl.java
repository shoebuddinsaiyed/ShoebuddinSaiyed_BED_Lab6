package com.grtlrn.CollgeFestManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grtlrn.CollgeFestManagement.Entity.Student;
import com.grtlrn.CollgeFestManagement.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {


	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {

		return studentRepository.findAll();
	}

	@Override
	public Student findbyId(int id) {
		// optional we are using as we dont know if value is present or not ,if its
		// present it will return true else false
		Optional<Student> results = studentRepository.findById(id);
		Student theStudent = null;
		if (results.isPresent())
			theStudent = results.get();
		return theStudent;
	}

	@Override
	public void save(Student student) {

		studentRepository.save(student);

	}

	@Override
	public void deleteByid(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);

	}

}
