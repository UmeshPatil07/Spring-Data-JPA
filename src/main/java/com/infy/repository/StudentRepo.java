package com.infy.repository;


import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.infy.dto.Student;

@Repository
public interface StudentRepo extends PagingAndSortingRepository<Student, Integer> {

	

	

	

	

}
