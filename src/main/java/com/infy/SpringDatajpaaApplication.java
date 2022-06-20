package com.infy;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.infy.dto.Student;
import com.infy.service.StudentServiceImpl;

@SpringBootApplication
public class SpringDatajpaaApplication implements CommandLineRunner {

	@Autowired
	StudentServiceImpl service;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	
		//addStudents();
		//getAllStudent();
		//delStudent();
		//getStudent();
		//getStudentPage1();
		sortData();
	}
	
		
		//For adding value
		public void addStudents() {
		Student S= new Student(103,"Mahesh","india",55);
	    service.addStudent(S);
}
		// for all content
		public void getAllStudent() {
			Iterable<Student> stdList=service.getAllStudent();
			for(Student s:stdList)
				System.out.println(s);
		}

		//for delete
	     public void delStudent() {
			service.delStudent(103);
			
		    }
	     //for searching specific Sno
	     public void getStudent() {
	 		int sNo=105;
	 		Student s=service.getStudent(sNo);
	 		System.out.println(s);
	 		
	 	}
	     //for paging
	     public void getStudentPage1() {
	    	 List<Student> a1=service.getStudentPage1();
	    	 for (Student s:a1)
	    		 System.out.println(s);
	     }
	     //for sorting
	    public void sortData() {
	    	Iterable<Student> a1= service.sortRecords();
	     for (Student s:a1)
	    		 System.out.println(s);
	     }
		   








}