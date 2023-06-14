package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repo.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public Department creatDepartment(Department department) {
		
		return departmentRepository.save(department);
	}

	@Override
	public Department findDepartmentById(int departmentId) {
		
		Optional<Department> department= departmentRepository.findById(departmentId);
		 if(department.isPresent()) {
			 return department.get();
		 }
		 return null;
	}

}
