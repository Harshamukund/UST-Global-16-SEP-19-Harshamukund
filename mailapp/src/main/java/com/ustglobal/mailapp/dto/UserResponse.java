package com.ustglobal.mailapp.dto;


import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class UserResponse {
	private String message;
	private int statuscode;
	private String description;
	private List<UserBean> user;
	private List<MailBean> email;

}
