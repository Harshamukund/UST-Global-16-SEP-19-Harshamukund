package com.ustglobal.controller;

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

import com.ustglobal.bean.ProductBean;
import com.ustglobal.bean.RetailerBean;
import com.ustglobal.service.RetailerService;
@Controller
public class RetailerController {
	@Autowired
	private RetailerService service;
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
		RetailerBean bean=service.login(id, password);
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
	public String register(RetailerBean bean,ModelMap map) {
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
@SessionAttribute(name="bean",required=false)RetailerBean bean) {
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
	public String search(@RequestParam("orderid")int id,ModelMap map) {
		ProductBean bean=service.searchProduct(id);
		
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
			@SessionAttribute(name="bean")RetailerBean bean,ModelMap map) {
		if(password.equals(cpassword)) {
			boolean check=service.changePassword(bean.getRetailerid(), password);
			if(check) {
			map.addAttribute("msg","password changed");
			return "home";
		}
		}else {
			map.addAttribute("msg","password not matched");
		}
			
			return "changepassword";
		
		
	}//end of change password
	
	
}
