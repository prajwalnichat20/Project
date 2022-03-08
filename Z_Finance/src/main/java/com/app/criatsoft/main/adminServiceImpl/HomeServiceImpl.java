package com.app.criatsoft.main.adminServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.criatsoft.main.adminException.PageNotFound;
import com.app.criatsoft.main.adminModel.Applicant;
import com.app.criatsoft.main.adminModel.Employee;
import com.app.criatsoft.main.adminRepository.ApplicantRepository;
import com.app.criatsoft.main.adminRepository.HomeRepository;
import com.app.criatsoft.main.adminService.HomeService;


@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeRepository hr;
	@Autowired
	ApplicantRepository ahr;
	
	@Override
	public void  saveData( Employee e){
		hr.save(e);
	}

	@Override
	public List<Employee> displaydata() {
		return 	hr.findAll();
		
	}

	@Override
	public void deletedata(long id) {
	
		try {
	 hr.deleteById(id);
	
		}catch (Exception e) {
			throw new PageNotFound("Id Not Found");
		}
		
	}

	@Override
	public void updateData(Employee e) {
		hr.save(e);
		
	}
	
	@Override
	public Employee getsinglebyuser(String employeeemail, String employeepassword) {
		
		Employee pro=null;
		try {
	 pro=  hr.findByEmployeeemailAndEmployeepassword(employeeemail, employeepassword);
	 System.out.println(pro.getEmployeeemail());
	 System.out.println(pro.getEmployeepassword());
		
		}
		catch (Exception e) {
			throw new PageNotFound("User Not Available");
		}
	return pro;
		
	}

	@Override
	public Employee getsingledata(Long eid) {

		Employee s = hr.findById(eid).get();
		
		return s;

	}
	
	public Iterable<Applicant> getall() {
		return ahr.findAll();
}

@Override
public Applicant findbyAppId(String id) {
	
	return ahr.findById(id).get();
}

@Override
public Applicant findbyAppName(String name) {
	
	return ahr.findByApplicantFname(name);
}

@Override
public long getemployyecount() {
	// TODO Auto-generated method stub
	return hr.count();
}

@Override
public long getapplicantcount() {
	// TODO Auto-generated method stub
	return ahr.count();
}
	
}
