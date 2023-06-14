package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping
	public ResponseEntity<?> createDepartment(@RequestBody Department department) {
		return ResponseEntity.status(HttpStatus.CREATED).body(departmentService.creatDepartment(department));
	}
	
	@GetMapping("/{departmentId}")
	public ResponseEntity<?> getDepartmentById(@PathVariable("departmentId") int departmentId){
		return ResponseEntity.ok(departmentService.findDepartmentById(departmentId));
	}

}
