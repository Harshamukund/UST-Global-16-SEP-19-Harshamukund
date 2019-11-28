
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
	}

}
