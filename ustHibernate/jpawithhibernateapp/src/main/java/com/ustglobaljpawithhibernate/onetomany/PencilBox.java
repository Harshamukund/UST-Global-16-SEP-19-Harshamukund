package com.ustglobaljpawithhibernate.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table(name="pencilBox")
public class PencilBox {
	@Id
	@Column
	private int pbid;
	@Column
	private String pbname;
	
	@OneToMany(mappedBy="pb")
	@Exclude
	
	private List<Pencil> pcil;

}
