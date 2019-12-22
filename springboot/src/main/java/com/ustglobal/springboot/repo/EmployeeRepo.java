package com.ustglobal.springboot.repo;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ustglobal.springboot.dto.EmployeeBean;

public interface EmployeeRepo extends JpaRepository<EmployeeBean, Integer>{
@Transactional
@Modifying
@Query("update EmployeeBean set name=:name,password=:password,gender=:gender,doj=:doj where id=:id")
	public void update(@Param("name")String name,@Param("password")String password,@Param("gender")String gender,@Param("doj")Date doj,@Param("id")int id) ;
		
	
}
