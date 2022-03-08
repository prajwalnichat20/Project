package com.app.criatsoft.main.adminController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.criatsoft.main.adminModel.Applicant;
import com.app.criatsoft.main.adminModel.EmailSender;
import com.app.criatsoft.main.adminModel.Employee;
import com.app.criatsoft.main.adminService.EmailService;
import com.app.criatsoft.main.adminService.HomeService;





@RequestMapping("app/admin")
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
public class HomeController {
	

	@Autowired
	HomeService hs;
	@Autowired
	EmailService ess;
	
	@PostMapping(value ="/insert" )
	public String regData(@RequestBody() Employee e) {
		
		System.out.println("UserName ="+e.getEmployeeemail());
		System.out.println("Password ="+e.getEmployeepassword());
		
		hs.saveData(e);

		return "Data Added Successfully";
	}
	
	@GetMapping(value = "/getlist")
	public List<Employee> getData() {

		List<Employee> list = hs.displaydata();

		return list;
	} 
	
	
	@GetMapping(value = "/getsinglebyuser/{un}/{ps}")
	public Employee getByUserName(@PathVariable("un") String employeeemail, @PathVariable("ps") String employeepassword) {

		Employee em = hs.getsinglebyuser(employeeemail, employeepassword);

		return em;
	}
	
	
	@DeleteMapping(value = "/delete/{employeeid}")
	public String deleteData(@PathVariable("employeeid") long id) {

		 hs.deletedata(id);

		return "Delete Data Successfully";
	}
	
	@PutMapping(value = "/update")
	public String updateData(@RequestBody() Employee e) {

		hs.updateData(e);

		return "Data Updated Successfully";
	}
	
	@GetMapping(value = "/getsingle/{id}")
	public Employee getSingleData(@PathVariable("id") Long eid) {

		Employee s = hs.getsingledata(eid);

		return s;
	}
	
	
	@Value("${spring.mail.username}")
	private String fromEmail;
	
	@PostMapping(value = "/send")
	public String EmailSends(@RequestBody EmailSender eml)
	{
		eml.setFromEmail(fromEmail);
		try
		{
			ess.sendEmail(eml);
			return "Email Send ";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "Email not Send";
		}
	}
	
	@GetMapping("/getemployeecount")
	public long getemployeecount()
	{
		System.out.println(hs.getemployyecount());
		return hs.getemployyecount();
	}
	
	//Applicant 
	
	@GetMapping("/getAll")
	public Iterable<Applicant> getList(){
		Iterable<Applicant> applist=hs.getall();
		return applist;
	}
	
	@GetMapping("/getappl/{id}")
	public Applicant getappli(@PathVariable String id) {
		Applicant app=hs.findbyAppId(id);
		return app;
	}
	
	@GetMapping("/getbyName/{name}")
	public Applicant getbyName(@PathVariable String name) {
		Applicant app=hs.findbyAppName(name);
		return app;
	}
	
	@GetMapping("/getapplicantcount")
	public long getapplicantcount()
	{
		System.out.println(hs.getapplicantcount());
		return hs.getapplicantcount();
	}
}
