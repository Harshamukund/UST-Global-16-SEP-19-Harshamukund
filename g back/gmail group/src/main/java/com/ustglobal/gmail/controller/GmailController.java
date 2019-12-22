package com.ustglobal.gmail.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.gmail.dto.GmailBean;
import com.ustglobal.gmail.dto.GmailResponse;
import com.ustglobal.gmail.dto.UserBean;
import com.ustglobal.gmail.service.GmailService;

@RestController
public class GmailController {
	

	private final static int statusCode = 201;
	private final static int statusCodeF = 401;
	private final static String  statusMge = "success";
	private final static String  statusMgeF = "failure";
	
	@Autowired
	private GmailService service;
	@Autowired
	private GmailResponse response;
	
	
	@PostMapping(path = "/register",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public GmailResponse regisetrUser(@RequestBody UserBean user) {
		if(service.registerUser(user)) {
			response.setStatuscode(statusCode);
			response.setMessage(statusMge);
			response.setDescription("User Registered");
		} else {
			response.setStatuscode(statusCodeF);
			response.setMessage(statusMgeF);
			response.setDescription("User not Registered");
		}
		return response;
	}
	
	
	@PostMapping(path = "/login",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public GmailResponse loginUser(@RequestBody UserBean bean) {
		UserBean user1 = service.loginUser(bean);
		if(user1!=null) {
			response.setStatuscode(statusCode);
			response.setMessage(statusMge);
			response.setDescription("User logined");
			response.setUser(Arrays.asList(user1));
		} else {
			response.setStatuscode(statusCodeF);
			response.setMessage(statusMgeF);
			response.setDescription("User not logined");
		}
		return response;
	}
		
	@GetMapping(path = "/inbox" ,consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
	public GmailResponse inbox(@RequestParam("to_id")int id) {
		List<GmailBean> email = service.inbox(id);
		if(email!=null) {
			response.setStatuscode(statusCode);
			response.setMessage(statusMge);
			response.setDescription("inbox list");
			response.setEmail(email);
		} else {
			response.setStatuscode(statusCodeF);
			response.setMessage(statusMgeF);
			response.setDescription("no mail recevied");
		}
		return response;	
	}
	@GetMapping(path = "/send",consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE )
	public GmailResponse send(@RequestParam("from_id")int id) {
		List<GmailBean> email = service.send(id);
		if(email!=null) {
			response.setStatuscode(statusCode);
			response.setMessage(statusMge);
			response.setDescription("send mail list");
			response.setEmail(email);
		} else {
			response.setStatuscode(statusCodeF);
			response.setMessage(statusMgeF);
			response.setDescription("no mail send");
		}
		return response;	
	}
	@GetMapping(path = "/draftlist",consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE )
	public GmailResponse draftList(@RequestParam("to_id")int id) {
		List<GmailBean> email = service.draftlist(id, "draft");
		if(email!=null) {
			response.setStatuscode(statusCode);
			response.setMessage(statusMge);
			response.setDescription("draft list");
			response.setEmail(email);
		} else {
			response.setStatuscode(statusCodeF);
			response.setMessage(statusMgeF);
			response.setDescription("no draft list");
		}
		return response;	
	}
	
	@PostMapping(path = "/forgotpassword",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public GmailResponse forgotPasswordr(@RequestParam("email") String email,@RequestParam("question") String question,@RequestParam("answer") String answer ) {
		UserBean pass =service.forgotPassowrd(email, question, answer);
		if(pass!=null) {
			response.setStatuscode(statusCode);
			response.setMessage(statusMge);
			response.setDescription("User password reset");
			response.setUser(Arrays.asList(pass));
		} else {
			response.setStatuscode(statusCodeF);
			response.setMessage(statusMgeF);
			response.setDescription("try again");
		}
		return response;
	}
	@PutMapping(path = "/changepassword",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public GmailResponse changePasswordr(@RequestParam("email") String email,@RequestParam("password") String password,@RequestParam("newPassword") String newPassword ) {
		if(service.changePassword(email, password, newPassword)) {
			response.setStatuscode(statusCode);
			response.setMessage(statusMge);
			response.setDescription("password changed");
		} else {
			response.setStatuscode(statusCodeF);
			response.setMessage(statusMgeF);
			response.setDescription("password not changed");
		}
		return response;
	}
	
	@PostMapping(path = "/compose",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public GmailResponse compose(@RequestParam("subject") String subject,@RequestParam("message") String message
			,@RequestParam("email") String email,@RequestParam("id")int id ) {
		
		if(service.compose(subject, message, email,id)) {
			response.setStatuscode(statusCode);
			response.setMessage(statusMge);
			response.setDescription("mail composed");
			
		} else {
			response.setStatuscode(statusCodeF);
			response.setMessage(statusMgeF);
			response.setDescription("mail not composed");
		}
		return response;
	}
	
	
	
	@PutMapping(path = "/delete",consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE )
	public GmailResponse delete(@RequestParam("id")int id) {
		
		if(service.delete(id)) {
			response.setStatuscode(statusCode);
			response.setMessage(statusMge);
			response.setDescription("status chandeg to delete");
			
		} else {
			response.setStatuscode(statusCodeF);
			response.setMessage(statusMgeF);
			response.setDescription("status not changed to delete");
		}
		return response;	
	}
	
	
	@DeleteMapping(path = "/parmanent",consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE )
	public GmailResponse Parmanentdelete(@RequestParam("id")int id) {
		
		if(service.deleteInbox(id)) {
			response.setStatuscode(statusCode);
			response.setMessage(statusMge);
			response.setDescription("deleted");
			
		} else {
			response.setStatuscode(statusCodeF);
			response.setMessage(statusMgeF);
			response.setDescription("not deleted");
		}
		return response;	
	}
	
}
