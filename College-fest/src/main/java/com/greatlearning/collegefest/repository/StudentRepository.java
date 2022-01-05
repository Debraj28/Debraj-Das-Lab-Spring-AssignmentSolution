package com.greatlearning.collegefest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.collegefest.enitity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	List<Student> findByNameContainsAndDepartmentContainsAndCountryContainsAllIgnoreCase(String name,String department, String country);
}
