package com.service.valueobjects;

import com.service.entity.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ResponseTemplateVo {
	private Users users;
	private Department department;
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users user) {
		this.users = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
