package com.ustglobal.mailapp.service;

import java.util.List;

import com.ustglobal.mailapp.dto.MailBean;
import com.ustglobal.mailapp.dto.UserBean;

public interface UserService {
	
	public boolean registerUser(UserBean user);
	public UserBean loginUser(String email,String password);
	public UserBean forgotPassowrd(String email,String question,String answer);
	public boolean changePassword(String email, String password,String newPassword);
	public boolean compose(String subject, String message, String email,int id);
	public boolean draft(String subject, String message, String email,int id);
	public List<MailBean> inbox(int to_id);
	public List<MailBean> send(int from_id);
	public boolean delete(int id);
	public List<MailBean> draftlist(int to_id,String status);
	public boolean deleteInbox(int id);
}
