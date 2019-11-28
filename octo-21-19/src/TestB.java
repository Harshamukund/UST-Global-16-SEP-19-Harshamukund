
public class TestB {

	public static void main(String[] args) {
		Cow c=new Cow();
		c.name="ganga";
		c.color="red";
		System.out.println("cow name is"+c.name);
		System.out.println("cow color is"+c.color);
		c.eat();
		c.sleep();
		System.out.println("==========================");
		Cow c1=new Cow();
		c1.name="kaveri";
		c1.color="black";
		System.out.println("cow1 name is "+c1.name);
		System.out.println("cow1 color is "+c1.color);
		c1.eat();
		c1.sleep();

	}

}
