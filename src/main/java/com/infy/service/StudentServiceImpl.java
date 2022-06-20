package com.infy.service;



import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.jaxb.SpringDataJaxb.PageRequestDto;
import org.springframework.stereotype.Service;


import com.infy.dto.Student;
import com.infy.repository.StudentRepo;



@Service
@Transactional
public class StudentServiceImpl {
	
	@Autowired
	StudentRepo repo;
	
	
	public boolean addStudent(Student S) {
		repo.save(S);
		return true;
		
	}
	
	public Iterable<Student> getAllStudent(){
		Iterable<Student> stdList=repo.findAll();
		
		return stdList;
	}
	
	public boolean delStudent(int id) { 
		if (repo.existsById(id)) {
			repo.deleteById(id);
			return true;
		}
		return false;
	}

	public Student getStudent(int id) {
		Optional<Student> o = repo.findById(id);
		if (o.isPresent()) {
			Student s=o.get();
			return s;
		}
		return null;
		
		
	}
     //for paging
	public List<Student> getStudentPage1() {
		// TODO Auto-generated method stub	
		PageRequest pageable = PageRequest.of(0, 4);
		Page<Student> page= repo.findAll(pageable);
		List<Student> stdList=page.getContent();
		return stdList;
	}
	//for sorting
	public Iterable<Student> sortRecords(){
	    Sort sort=Sort.by("sName");
		Iterable<Student> stdList=repo.findAll(sort);
		return stdList;
	}
	
		
	

	

	
	

}
