package com.ustglobal.mailapp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "email_info")
public class MailBean {
	
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private String subject;
	@Column
	private String message;
	@Column
	private String status;
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "to_id")
	private UserBean user;
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "from_id")
	private UserBean userbean;
	

}
