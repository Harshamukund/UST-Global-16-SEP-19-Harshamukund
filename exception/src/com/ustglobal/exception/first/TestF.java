package com.ustglobal.exception.first;

public class TestF {

	public static void main(String[] args) {
		int[] a= {10,20,30};
		String s=null;
		int b=10;
		

		try {
			String s1=s.toUpperCase();
			System.out.println(s1);
			System.out.println(b/0);
			System.out.println(a[4]);
			

		}catch(NullPointerException ne) {
			System.out.println("dont play with null");
		}
	
		catch(ArithmeticException ae) {
			System.out.println("number divided by zero");
		}
		
			catch(ArrayIndexOutOfBoundsException ai) {
		
			System.out.println("index not present");
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(b);
		System.out.println("main ended");

	


	}

}
