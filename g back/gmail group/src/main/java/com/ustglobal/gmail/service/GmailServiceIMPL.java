package com.ustglobal.gmail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.gmail.dao.GmailDAO;
import com.ustglobal.gmail.dto.GmailBean;
import com.ustglobal.gmail.dto.UserBean;
@Service
public class GmailServiceIMPL implements GmailService{

	@Autowired
	private GmailDAO dao;
	@Override
	public boolean registerUser(UserBean user) {
		return dao.registerUser(user);
	}

	@Override
	public UserBean loginUser(UserBean bean) {
		return dao.loginUser(bean);
	}

	@Override
	public UserBean forgotPassowrd(String email, String question, String answer) {
		return dao.forgotPassowrd(email, question, answer);
	}

	@Override
	public boolean changePassword(String email, String password, String newPassword) {
		return dao.changePassword(email, password, newPassword);
	}

	@Override
	public boolean compose(String subject, String message, String email,int id) {
		return dao.compose(subject, message,email,id);
	}

	@Override
	public List<GmailBean> inbox(int to_id) {
		return dao.inbox(to_id);
	}

	@Override
	public List<GmailBean> send(int from_id) {
		return dao.send(from_id);
	}

	@Override
	public boolean delete(int id) {
		return dao.delete(id);
	}

	@Override
	public boolean draft(String subject, String message, String email, int id) {
		return dao.draft(subject, message, email, id);
	}

	@Override
	public List<GmailBean> draftlist(int to_id, String status) {
		return dao.draftlist(to_id, status);
	}

	@Override
	public boolean deleteInbox(int id) {
		return dao.deleteInbox(id);
	}

}
