package com.ustglobal.librarymanagement.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="bookstransaction")
public class BooksTransaction {
	@Id
	@Column
	private int transactionid;
	@Column
	private int registrationid;
	@Column
	private Date issuedate;
	@Column
	private Date retundate;
	@Column
	private double fine;

}
