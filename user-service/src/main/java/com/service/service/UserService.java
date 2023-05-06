package com.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.service.entity.Users;
import com.service.repository.UserRepository;
import com.service.valueobjects.Department;
import com.service.valueobjects.ResponseTemplateVo;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;
	
	public Users saveUser(Users users) {
		return userRepository.save(users);
	}

	public ResponseTemplateVo getUserWithDepartment(Long userId) {
		ResponseTemplateVo vo = new ResponseTemplateVo();
		Users users = userRepository.findByUserId(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + users.getDepartmentId(), Department.class);
		vo.setUsers(users);
		vo.setDepartment(department);
		return vo;
	}


}
