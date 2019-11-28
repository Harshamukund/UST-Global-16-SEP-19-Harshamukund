package atmmachine;

public class MainClass {
	public static void main(String[] args) {
		Machine m=new Machine();
		Hdfc h=new Hdfc();
		Icici i=new Icici();
		Sbi s=new Sbi();
		m.slot(h);
		m.slot(i);
		m.slot(s);
	}
}