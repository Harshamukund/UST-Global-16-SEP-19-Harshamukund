package com.ustglobal.mailapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.mailapp.dto.MailBean;
import com.ustglobal.mailapp.dto.UserBean;
import com.ustglobal.mailapp.dto.UserResponse;
import com.ustglobal.mailapp.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	@Autowired
	private UserResponse response;
	
		
	@PostMapping(path = "/login",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse loginUser(@RequestBody UserBean user) {
		UserBean user1 = service.loginUser(user.getEmail(),user.getPassword());
		if(user1!=null) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("User logined");
			response.setUser(Arrays.asList(user1));
		} else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("User not logined");
		}
		return response;
		
	}
	
	@PostMapping(path = "/register",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse regisetrUser(@RequestBody UserBean user) {
		if(service.registerUser(user)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("User Registered");
		} else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("User Registered");
		}
		return response;
	}
	

	
	@PostMapping(path = "/forgotpassword",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse forgotPasswordr(@RequestParam("email") String email,@RequestParam("question") String question,@RequestParam("answer") String answer ) {
		UserBean pass =service.forgotPassowrd(email, question, answer);
		if(pass!=null) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("User password reset");
			response.setUser(Arrays.asList(pass));
		} else {
			response.setStatuscode(401);
			response.setMessage("success");
			response.setDescription("try again");
		}
		return response;
	}
	@PutMapping(path = "/changepassword",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse changePasswordr(@RequestParam("email") String email,@RequestParam("password") String password,@RequestParam("newPassword") String newPassword ) {
		if(service.changePassword(email, password, newPassword)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("password changed");
		} else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("password not changed");
		}
		return response;
	}
	
	
	
	@PostMapping(path = "/compose",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse compose(@RequestParam("subject") String subject,@RequestParam("message") String message
			,@RequestParam("email") String email,@RequestParam("id")int id ) {
		
		if(service.compose(subject, message, email,id)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("mail composed");
			
		} else {
			response.setStatuscode(401);
			response.setMessage("success");
			response.setDescription("mail not composed");
		}
		return response;
	}
	
	@GetMapping(path = "/inbox" ,consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse inbox(@RequestParam("to_id")int id) {
		List<MailBean> email = service.inbox(id);
		if(email!=null) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("inbox list");
			response.setEmail(email);
		} else {
			response.setStatuscode(401);
			response.setMessage("Failure");
			response.setDescription("no mail recevied");
		}
		return response;	
	}
	@GetMapping(path = "/send",consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE )
	public UserResponse send(@RequestParam("from_id")int id) {
		List<MailBean> email = service.send(id);
		if(email!=null) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("send mail list");
			response.setEmail(email);
		} else {
			response.setStatuscode(401);
			response.setMessage("success");
			response.setDescription("no mail send");
		}
		return response;	
	}
	@GetMapping(path = "/draftlist",consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE )
	public UserResponse draftList(@RequestParam("to_id")int id) {
		List<MailBean> email = service.draftlist(id, "draft");
		if(email!=null) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("draft list");
			response.setEmail(email);
		} else {
			response.setStatuscode(401);
			response.setMessage("success");
			response.setDescription("no draft list");
		}
		return response;	
	}
	
	@PutMapping(path = "/delete",consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE )
	public UserResponse delete(@RequestParam("id")int id) {
		
		if(service.delete(id)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("status chandeg to delete");
			
		} else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("status not changed to delete");
		}
		return response;	
	}
	
	
	@DeleteMapping(path = "/parmanent",consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE )
	public UserResponse Parmanentdelete(@RequestParam("id")int id) {
		
		if(service.deleteInbox(id)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("deleted");
			
		} else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("not deleted");
		}
		return response;	
	}
}
