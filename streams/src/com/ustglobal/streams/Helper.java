package com.ustglobal.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper implements Comparator<Student>{
	void display(ArrayList<Student> al) {
		Iterator<Student> it=al.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
		}}
		void displayFailed(ArrayList<Student> a) {
		List<Student> l=	a.stream().filter(student->student.percentage<40).collect(Collectors.toList());
		
		Iterator<Student> it1=l.iterator();
		while(it1.hasNext()) {
			Student s=it1.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
		}
		}
		void displayTopper(ArrayList<Student> aa) {
			List<Student> l1=	aa.stream().max().collect(Collectors.toList());
			
			Iterator<Student> it1=l1.iterator();
			while(it1.hasNext()) {
				Student s=it1.next();
				System.out.println(s.id);
				System.out.println(s.name);
				System.out.println(s.percentage);
			}

		
	}
		@Override
		public int compare(Student o1, Student o2) {
			if(o1.percentage>o2.percentage) {
				return 1;
			}
			else if(o1.percentage<o2.percentage) {
				return -1;
			}
			else {
				return 0;
			}
			
		}

}
