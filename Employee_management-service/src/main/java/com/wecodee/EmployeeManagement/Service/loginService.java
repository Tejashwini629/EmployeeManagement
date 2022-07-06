package com.wecodee.EmployeeManagement.Service;

import com.wecodee.EmployeeManagement.responseDTO.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecodee.EmployeeManagement.Repository.LoginRepository;
import com.wecodee.EmployeeManagement.entity.login;

import java.util.List;

@Service
public class loginService {

	@Autowired
	private LoginRepository logrepo;
	
	public ApiResponse<String> createUser(login l) {
		//login login =logrepo.getByUsername(l.getUsername());
		List<login> log = logrepo.findAll();
		for (login login1 : log) {
			if (l.getUsername().equals(login1.getUsername())) {
				if (l.getPassword().equals(login1.getPassword())) {
					return ApiResponse.success("loginsucessfull",null);
					//return "login sucessfull";
				}
				//return "invalid username";
				return ApiResponse.failure("invalid username");
			}
		}
		//return "invalid credential";
		return ApiResponse.failure("invalid credential");
	}
}
