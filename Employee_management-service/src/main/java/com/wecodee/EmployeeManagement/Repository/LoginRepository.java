package com.wecodee.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecodee.EmployeeManagement.entity.login;

@Repository
public interface LoginRepository extends JpaRepository<login, String>{

//login getByUsername(String username);

}
