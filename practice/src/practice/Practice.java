package practice;


public class Practice {
	int a=10;
	public static void main(String[] args) {
	Practice p=new Practice();
	p.practice1();
	Practice.practice();
	
	}
	public static  void practice() {
		
		try {
			Practice p2=new Practice();
		p2.practice();
		p2.a=p2.a+30;
		System.out.println(p2.a);
		}catch(Exception e){
			e.printStackTrace();
		
		
		}
	}
	public   void practice1() {
		
		a=a+10;
		System.out.println(a);
	}


}
