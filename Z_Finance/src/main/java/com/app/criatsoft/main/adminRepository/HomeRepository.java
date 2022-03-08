package com.app.criatsoft.main.adminRepository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.criatsoft.main.adminModel.Employee;
@Repository
public interface HomeRepository extends JpaRepository<Employee, Long>{

	Employee findByEmployeeemailAndEmployeepassword(String employeeemail, String employeepassword);

	



	

	



}
