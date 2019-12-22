package com.ustglobal.gmail.dto;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.CodePointLength;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table(name="user_info")
public class UserBean {
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String question;
	@Column
	private String ans;
	@Exclude
	@JsonIgnore
	@OneToMany(mappedBy = "user")
	private List<GmailBean> mail;
	@Exclude
	@JsonIgnore
	@OneToMany(mappedBy = "userbean")
	private List<GmailBean> emailbean;

}
