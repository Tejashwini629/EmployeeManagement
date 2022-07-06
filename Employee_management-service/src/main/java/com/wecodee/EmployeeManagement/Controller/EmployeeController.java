package com.wecodee.EmployeeManagement.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wecodee.EmployeeManagement.Repository.EmployeeRepository;
import com.wecodee.EmployeeManagement.Service.EmployeeService;
import com.wecodee.EmployeeManagement.entity.Employee;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:4200")

public class EmployeeController {
	
	@Autowired
	private EmployeeService empservice;
	
	@GetMapping("/getemployee")
	public List<Employee> getallemployee()
	{
		return this.empservice.getemployee();
	}
	
	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee emp)
	{
		return empservice.addEmployee(emp);
	}
	
	@GetMapping("/getEmployee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable("id") int  id)
	{
		return empservice.getEmployeeById(id);
	}
	
	@DeleteMapping("/deleteemployee/{empid}")
	public String deleteId(@PathVariable int empid)
	{
		return empservice.deleteEmployee(empid);
	}
	
	@PutMapping("/updateemployee")
	public Employee updateEmployee(@RequestBody Employee e)
	{
		return empservice.updateEmployee(e);
	}

	@GetMapping("/getEmployeeWithGreaterSalary/{salary}")
	public List<Employee> getEmployeebysalary(@PathVariable ("salary") long salary )
	{
		return empservice.getEmployeeByGreaterSalary(salary);
	}
	
	@GetMapping("/getByDepartment/{department}")
	public List<Employee> findByDepartment(@PathVariable ("department") String department )
	{
		return empservice.findByDepartmentName(department);
	}
	
	@GetMapping("/getBetweenAge/{startAge}/{endAge}")
	public List<Employee> findByAge(@PathVariable ("startAge") int startAge,@PathVariable ("endAge") int endAge )
	{
		return empservice.getEmployeeByDob(startAge,endAge);
	}
	
	@GetMapping("/getEmployeeByDob/{fromDate}/{toDate}")
	public List<Employee>getEmployeeByDate(@PathVariable("fromDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date fromDate,
										   @PathVariable("toDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date toDate)
	{
		return empservice.getEmployeeByDob(fromDate,toDate);
	}

}
