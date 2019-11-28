
public class TestG {

	public static void main(String[] args) {
		FirstGen f1=new FirstGen();
		f1.call();
		f1.msg();
		SecondGen f2=new SecondGen();
		f2.call();
		f2.msg();
		f2.games();
		ThirdGen f3=new ThirdGen();
	
		f3.call();
		f3.msg();
		f3.games();
		f3.camera();

	}

}
