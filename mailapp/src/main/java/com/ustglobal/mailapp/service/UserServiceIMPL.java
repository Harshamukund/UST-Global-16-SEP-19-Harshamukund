package com.ustglobal.mailapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.mailapp.dao.UserDAO;
import com.ustglobal.mailapp.dto.MailBean;
import com.ustglobal.mailapp.dto.UserBean;
@Service
public class UserServiceIMPL implements UserService {
	@Autowired
	private UserDAO dao;
	@Override
	public boolean registerUser(UserBean user) {
		// TODO Auto-generated method stub
		return dao.registerUser(user);
	}

	@Override
	public UserBean loginUser(String email, String password) {
		// TODO Auto-generated method stub
		return dao.loginUser(email, password);
	}

	@Override
	public UserBean forgotPassowrd(String email, String question, String answer) {
		// TODO Auto-generated method stub
		return dao.forgotPassowrd(email, question, answer);
	}

	@Override
	public boolean changePassword(String email, String password, String newPassword) {
		// TODO Auto-generated method stub
		return dao.changePassword(email, password, newPassword);
	}

	@Override
	public boolean compose(String subject, String message, String email,int id) {
		// TODO Auto-generated method stub
		return dao.compose(subject, message,email,id);
	}

	@Override
	public List<MailBean> inbox(int to_id) {
		// TODO Auto-generated method stub
		return dao.inbox(to_id);
	}

	@Override
	public List<MailBean> send(int from_id) {
		// TODO Auto-generated method stub
		return dao.send(from_id);
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public boolean draft(String subject, String message, String email, int id) {
		// TODO Auto-generated method stub
		return dao.draft(subject, message, email, id);
	}

	@Override
	public List<MailBean> draftlist(int to_id, String status) {
		// TODO Auto-generated method stub
		return dao.draftlist(to_id, status);
	}

	@Override
	public boolean deleteInbox(int id) {
		// TODO Auto-generated method stub
		return dao.deleteInbox(id);
	}
}
