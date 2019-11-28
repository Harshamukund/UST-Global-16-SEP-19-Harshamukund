package com.testyantra.qspiders.phone.dao;

import java.util.ArrayList;

import com.testyantra.qspiders.phone.dto.PhoneBeanClass;

public interface PhoneDAO {

	public void addContact();
	public void deleteContact();
	public void editContact();
	public PhoneBeanClass searchContact();
	public ArrayList<PhoneBeanClass> displayContact();
	
	
}
