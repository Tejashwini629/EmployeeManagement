package com.wecodee.EmployeeManagement.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wecodee.EmployeeManagement.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
	public List<Employee> findByDepartment(String department);
	
	public List<Employee> findBySalaryGreaterThan(long salary);
	
//	Employee findById(int id);
	
	@Query("from Employee WHERE age BETWEEN :startAge and :endAge")
	List<Employee> findByAgeRange(@Param("startAge")int startAge,@Param ("endAge")int endAge);

	
	@Query("from Employee WHERE dob BETWEEN :fromDate and :toDate")
	List<Employee> getEmployeeDetailsByDob(@Param("fromDate") Date fromDate,@Param("toDate") Date toDate);
}
