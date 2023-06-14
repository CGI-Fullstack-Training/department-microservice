package com.example.demo.service;

import com.example.demo.model.Department;

public interface DepartmentService {

	public Department creatDepartment(Department department);
	
	public Department findDepartmentById(int departmentId);
}
