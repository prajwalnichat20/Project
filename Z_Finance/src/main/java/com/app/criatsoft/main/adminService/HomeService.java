package com.app.criatsoft.main.adminService;

import java.util.List;

import com.app.criatsoft.main.adminModel.Applicant;
import com.app.criatsoft.main.adminModel.Employee;

public interface HomeService {
	
	void saveData(Employee e);

	List<Employee> displaydata();

	void deletedata(long id);

	void updateData(Employee e);

	Employee getsingledata(Long eid);

	Employee getsinglebyuser(String employeeemail, String employeepassword);
	
	Iterable<Applicant> getall();

	Applicant findbyAppId(String id);

	Applicant findbyAppName(String name);

	long getemployyecount();

	long getapplicantcount();

}
