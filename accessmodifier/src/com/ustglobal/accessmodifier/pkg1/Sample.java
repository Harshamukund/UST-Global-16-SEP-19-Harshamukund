package com.ustglobal.accessmodifier.pkg1;

import com.ustglobal.accessmodifier.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {
		Demo d=new Demo();
		/*		System.out.println(d.a);private members cannot be accessed
		*/
		Sample s=new Sample();

				/*default*/
		
				/*System.out.println(s.b);
				s.sub();*/
				/*protected*/
				System.out.println(s.c);
				s.mul();
				/*public*/
				System.out.println(d.name);
				d.div();
				
	}

}
