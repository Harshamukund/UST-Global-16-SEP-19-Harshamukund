package com.ustglobal.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	private int pid;
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="vid")
	private VoterCard card;
	
	
	
	

}
