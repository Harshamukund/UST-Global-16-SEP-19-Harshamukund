
public class TestB {
	static int b;
	int c;
	{
		b=10;
		c=40;
		System.out.println("instance black 1");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		TestB b =new TestB();
		TestB b1=new TestB();
		System.out.println("main ended");
		

	}
	{
		b=60;
		c=80;
		System.out.println("instance bloc 2");
	}
	

}
