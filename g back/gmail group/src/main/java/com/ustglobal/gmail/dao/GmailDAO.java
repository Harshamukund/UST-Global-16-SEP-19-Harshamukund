package com.ustglobal.gmail.dao;

import java.util.List;

import com.ustglobal.gmail.dto.GmailBean;
import com.ustglobal.gmail.dto.UserBean;

public interface GmailDAO {
	public boolean registerUser(UserBean user);
	public UserBean loginUser(UserBean bean);
	public List<GmailBean> inbox(int to_id);
	public List<GmailBean> send(int from_id);
	public boolean delete(int id);
	public List<GmailBean> draftlist(int to_id,String status);
	public boolean deleteInbox(int id);
	public UserBean forgotPassowrd(String email,String question,String answer);
	public boolean changePassword(String email, String password,String newPassword);
	public boolean compose(String subject,String message,String email,int id);
	public boolean draft(String subject, String message, String email,int id);
}
