package com.ustglobal.gmail.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class GmailResponse {
	private String message;
	private int statuscode;
	private String description;
	private List<UserBean> user;
	private List<GmailBean> email;
}
