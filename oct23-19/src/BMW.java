
public class BMW implements AutoMobile,AutoMobileWithAbs {

	@Override
	public int gear() {
		System.out.println("gear() method of bmw");
		return 10;
	}

	@Override
	public void gps() {
		System.out.println("gps method of bmw");
		
		
	}

	@Override
	public void abs() {
		System.out.println("abs() method of bmw");
		
	}
	

}
