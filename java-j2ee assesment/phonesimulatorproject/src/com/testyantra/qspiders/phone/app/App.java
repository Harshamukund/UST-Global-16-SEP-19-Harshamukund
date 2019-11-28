package com.testyantra.qspiders.phone.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.testyantra.qspiders.phone.dao.PhoneDAO;
import com.testyantra.qspiders.phone.dto.PhoneBeanClass;
import com.testyantra.qspiders.phone.util.PhoneUtilClass;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.println("Press 1 to Show all contacts");
//		System.out.println("Press 2 to Search for a contact using Contact Name");
//		System.out.println("Press 3 to operate on contact");
		
		System.out.println("Welcome to Phone Simulator Application Develepoment");
	
		switchMethod();

	}
	
	public static void switchMethod()
	{
		System.out.println("Press 1 to Show all contacts");
		System.out.println("Press 2 to Search for a contact using Contact Name");
		System.out.println("Press 3 to operate on contact");
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();

		
		switch(firstNumber)
		{
		case 1 : PhoneDAO dao = PhoneUtilClass.getDAOImpInstance();
				ArrayList<PhoneBeanClass> list = dao.displayContact();
				
					for (PhoneBeanClass phoneBeanClass : list) {
						System.out.println("Name is "+phoneBeanClass.getName());
						System.out.println("Number is "+phoneBeanClass.getNumber());
						System.out.println("groups is "+phoneBeanClass.getGroups());
						System.out.println("=================");
						
					}
					switchMethod();
					break;
			
		case 2: PhoneDAO dao1 = PhoneUtilClass.getDAOImpInstance();
		PhoneBeanClass bean = dao1.searchContact();
			if(bean == null) 
			{
				System.out.println("no contacts found with the name");
				switchMethod();
			}else
			{
				System.out.println("name is "+bean.getName());
				System.out.println("Number is "+bean.getNumber());
				System.out.println("groups is "+bean.getGroups());
				System.out.println("=======================");
				System.out.println("Press 1 to call ");
				System.out.println("Press 2 to message");
				System.out.println("Press 3 to go back to main menu");
				int secondNumber = sc.nextInt();
				switch(secondNumber) {
				case 1: System.out.println("Calling "+bean.getName());
				System.out.println("Press 1 to end");
				int end =sc.nextInt();
				if(end ==1)
					System.out.println("call ended");
					break;
				case 2: System.out.println("Type message");
						String message =sc.next();
						System.out.println("Sending message -> '"+message+"' to "+bean.getName());
						switchMethod();
				break;
				case 3: System.out.println("going back to main menu");
				switchMethod();
				}
			}
			
			break;
		case 3:System.out.println("Press 1 to add the contact");
		System.out.println("Press 2 to delete the contact");
		System.out.println("Press 3 to edit the contact");
		int thridNumber  = sc.nextInt();
		switch(thridNumber)
		{
		case 1: PhoneDAO dao3 = PhoneUtilClass.getDAOImpInstance();
		dao3.addContact();
		switchMethod();
		break;
		case 2: PhoneDAO dao4 = PhoneUtilClass.getDAOImpInstance(); 
		dao4.deleteContact();
		switchMethod();
		break;
		case 3:PhoneDAO dao5 = PhoneUtilClass.getDAOImpInstance(); 
		dao5.editContact();
		switchMethod();
		break;
		default:System.out.println("Invalid number");
		switchMethod();
			
		}
		
		
		}
	}
}
