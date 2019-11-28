package com.ustglobal.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CsvReader {
	public static void main(String[] args) {
		
		try (FileReader in = new FileReader("csv.txt");
				BufferedReader reader=new BufferedReader(in);){
			while(reader.ready()) {
				String line=reader.readLine();
				String[] words=line.split(",");
			System.out.println("Id is "+words[0]);
			System.out.println("Name is "+words[1]);
			System.out.println("Salary is "+words[2]);
			System.out.println("Gender is "+words[3]);

			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
