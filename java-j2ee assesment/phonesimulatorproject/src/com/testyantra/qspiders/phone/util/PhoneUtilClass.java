package com.testyantra.qspiders.phone.util;

import com.testyantra.qspiders.phone.dao.PhoneDAO;
import com.testyantra.qspiders.phone.dao.PhoneDAOImp;

public class PhoneUtilClass 
{
	
	private PhoneUtilClass()
	{
		
	}
	public  static PhoneDAO getDAOImpInstance()
	{
		PhoneDAO dao = new PhoneDAOImp();
		return dao;
	}
}
