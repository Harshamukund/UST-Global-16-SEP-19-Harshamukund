package com.ustglobal.empspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.empspringmvc.dto.EmployeeBean;
import com.ustglobal.empspringmvc.service.EmployeeService;
import com.ustglobal.empspringmvc.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		 SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		 CustomDateEditor editor=new CustomDateEditor(format, true);
		 binder.registerCustomEditor(Date.class, editor);
	 
	 }
	 
	@GetMapping("/login")
	public String loginPage() {
		return "login";
		
	}
	@PostMapping("/login")
	public String login(int id,String password,HttpServletRequest request) {
		EmployeeBean bean=service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg", "invalid credentials");
			return "login";
			
		}else {
			HttpSession session=request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}//end of login
		
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}
	@PostMapping("/register")
	public String register(EmployeeBean bean,ModelMap map) {
		int check=service.register(bean);
		if(check>0) {
			map.addAttribute("msg","you are Registered and id is "+check);
		}else {
			map.addAttribute("msg","Email is repeated");

		}
		return "login";
	}
	@GetMapping("/home")
	public String home(ModelMap map,
@SessionAttribute(name="bean",required=false)EmployeeBean bean) {
		if(bean==null) {
			map.addAttribute("msg","login first");
			return "login";
		}else {
			return "home";
		}
	}
	@PostMapping("/home")
public String home() {
	return "home";
}
	@GetMapping("/search")
	public String search(@RequestParam("id")int id,ModelMap map) {
		EmployeeBean bean=service.searchEmployee(id);
		
		if(bean==null) {
			map.addAttribute("msg","Data not found");
		}else {
			map.addAttribute("bean",bean);
		}
		return "home";
	}
	@GetMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "login";
	}
	@GetMapping("/delete")
	public String deleteProfile(HttpSession session) {
		EmployeeBean bean=(EmployeeBean)session.getAttribute("bean");
		try {
		service.deleteEmployee(bean.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
		session.invalidate();
		return "login";
	}
	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		if(session!=null) {
			return "changepassword";
		}else {
			return "login";
		}
	}
	@PostMapping("/changepassword")
	public String changePassword(String password,String cpassword,
			@SessionAttribute(name="bean")EmployeeBean bean,ModelMap map) {
		if(password.equals(cpassword)) {
			boolean check=service.changePassword(bean.getId(), password);
			if(check) {
			map.addAttribute("msg","password changed");
			return "home";
		}
		}else {
			map.addAttribute("msg","password not matched");
		}
			
			return "changepassword";
		
		
	}//end of change password
	
	@GetMapping("/update")
	public String updateProfile(HttpServletRequest request,ModelMap map) {
		HttpSession session=request.getSession(false);
		if(session!=null) {
			return "update";
		}
		else {
			map.addAttribute("msg","login first");
			return "login";
		}
	}
		@PostMapping("/update")
		public String updateProfile(HttpSession session,EmployeeBean employeebean,ModelMap map) {
			EmployeeBean bean=(EmployeeBean)session.getAttribute("bean");
			employeebean.setId(bean.getId());
			employeebean.setPassword(bean.getPassword());
			boolean check=service.updateEmployee(employeebean);
		if(check) {
			map.addAttribute("msg","profile updated successfully");
			session.setAttribute("bean", employeebean);
			System.out.println("update 11223344 "+bean);
			return "home";
		}
		else {
			map.addAttribute("msg","not updated successfully");
		}
		return "updateProfile";
		}
	//delete
		/*@GetMapping("/delete")
		public String deleteProfil(HttpSession session,ModelMap map) {
			EmployeeBean bean=(EmployeeBean)session.getAttribute("bean");
			boolean check=service.deleteEmployee(bean.getId());
			if(check) {
				try {
			
				session.invalidate();
				map.addAttribute("msg","profile deleted successfully");
				return "login";
			}
				catch(Exception e) {
				map.addAttribute("msg","profil deleted unsuccessfully");
				
				}
				
		}
			
			return "home";
	}
*/}

