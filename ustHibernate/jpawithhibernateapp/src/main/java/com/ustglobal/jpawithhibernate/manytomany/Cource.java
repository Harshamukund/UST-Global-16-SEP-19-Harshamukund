package com.ustglobal.jpawithhibernate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table
public class Cource {
	@Id
	@Column
	private int cid;
	@Column
	private String cname;
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="cources")
	private List<Student> students;

}
