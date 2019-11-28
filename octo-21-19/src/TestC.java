
public class TestC {

	public static void main(String[] args) {

		Person.color="wheatish";
		System.out.println("person color is "+Person.color);
		Person.sleep();
		System.out.println("===================");
		Person p=new Person();
		p.name="kishor";
		p.age=25;
		System.out.println("person name is "+p.name);
		System.out.println("person age is "+p.age);
		p.eat();
		p.walk();

		Person p2=new Person();
		p2.age=25;
		p2.color="fair";
		p2.name="vinay";
		System.out.println("person2 name is "+p2.name);
		System.out.println("person2 age is "+p2.age);

		System.out.println("person2 color is "+p2.color);

	}

}
