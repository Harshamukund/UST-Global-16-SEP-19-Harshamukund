package com.ustglobal.objectclass;

public class TestH {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1=new Person(1, "ravi");
		Object obj=p1.clone();
		Person p2=(Person) obj;
		System.out.println("p1 id "+p1.id);
		System.out.println("p1.name "+p1.name);
		System.out.println("p2 id "+p2.id);
		System.out.println("p2.name "+p2.name);
		p2.id=200;
		p2.name="surya";
		System.out.println("after cloning");
		System.out.println("p1 id "+p1.id);
		System.out.println("p1.name "+p1.name);
		System.out.println("p2 id "+p2.id);
		System.out.println("p2.name "+p2.name);
		
	}

	

}
