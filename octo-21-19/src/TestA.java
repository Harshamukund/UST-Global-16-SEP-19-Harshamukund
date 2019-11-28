
public class TestA {

	public static void main(String[] args) {
		Pen p=	new Pen();
		p.cost=100;
		p.brand="cello";
		p.color="blue";
		System.out.println("cost is"+p.cost);
		System.out.println("cost is"+p.brand);
		System.out.println("cost is"+p.color);
		p.write();
		System.out.println("====================");
		Van v=new Van();
		v.cost=20000;
		v.color="red";
		System.out.println("van cost is"+v.cost);
		System.out.println("van color is"+v.color);
		v.move();
		Van v1=new Van();
		v1.cost=500000;
		v1.color="yellow";
		System.out.println("van1 cost is"+v1.cost);
		System.out.println("van1 color is"+v1.color);
		v1.move();

		

	}

}
