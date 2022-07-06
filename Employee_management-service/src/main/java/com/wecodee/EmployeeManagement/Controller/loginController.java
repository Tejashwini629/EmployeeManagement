package com.wecodee.EmployeeManagement.Controller;

import com.wecodee.EmployeeManagement.responseDTO.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wecodee.EmployeeManagement.Service.loginService;
import com.wecodee.EmployeeManagement.entity.login;

@RestController
@RequestMapping("/login/")
@CrossOrigin(origins="http://localhost:4200")
public class loginController {

	@Autowired
	private loginService logservice;
	
	@PostMapping("/adduser")
	public ApiResponse<String> adduser(@RequestBody login l)
	{
		return this.logservice.createUser(l);
	}
}
