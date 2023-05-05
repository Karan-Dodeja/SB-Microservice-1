package com.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.entity.Department;
import com.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department deprtment) {

		return departmentRepository.save(deprtment);
	}

	public Department findDepartmentById(Long departmentid) {
		return departmentRepository.findByDepartmentId(departmentid);
	}
	
}
