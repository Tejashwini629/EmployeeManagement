package com.wecodee.EmployeeManagement.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wecodee.EmployeeManagement.Repository.EmployeeRepository;
import com.wecodee.EmployeeManagement.entity.Employee;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository emprepo;
	
	public List<Employee> getemployee()
	{
		return this.emprepo.findAll();
	}
	

	//addemployee
//	aldada
	public Employee addEmployee(Employee e) 
	{
		return this.emprepo.save(e);
	}
	
	//delete
	public String deleteEmployee(int id)
	{
		this.emprepo.deleteById( id);
		return "employee deleted";
	}
	
	//updateemployee
	//second commit dsdusdhus
	public Employee updateEmployee(Employee emp) 
	{
		Employee oldEmploye=null;
		Optional<Employee>testEmployee=emprepo.findById(emp.getId());
		if(testEmployee.isPresent())
		{
			oldEmploye=testEmployee.get();
			oldEmploye.setFirstName(emp.getFirstName());
			oldEmploye.setLastName(emp.getLastName());
			oldEmploye.setSalary(emp.getSalary());
			oldEmploye.setAge(emp.getAge());
			oldEmploye.setDob(emp.getDob());
			oldEmploye.setDepartment(emp.getDepartment());
			emprepo.save(oldEmploye);
		}
		else
		{
			return new Employee();
		}
		return oldEmploye;	
	}

	public Page<Employee> findEmployeeWithPagination(@PathVariable int pageNumber, @PathVariable int pageSize)
	{
		Page<Employee> employee=emprepo.findAll(PageRequest.of(pageNumber,pageSize));
		return employee;
	}


	public List<Employee> getEmployeeByGreaterSalary(long salary) {
		return emprepo.findBySalaryGreaterThan(salary);
	}

	public List<Employee> findByDepartmentName(String department) {
		return emprepo.findByDepartment(department);
	}

	public List<Employee> getEmployeeByDob(int startAge , int endAge) {
		return emprepo.findByAgeRange(startAge, endAge);
	}
	
	public List<Employee> getEmployeeByDob(Date fromDate, Date toDate) {
		return emprepo.getEmployeeDetailsByDob(fromDate, toDate);
	}


	public Optional<Employee> getEmployeeById(int id) {
		return emprepo.findById(id);
	}
}
