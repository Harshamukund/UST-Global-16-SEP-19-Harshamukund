package com.ustglobal.streams;

public class Demo {
	public Number test() {
		return new Integer(10);
	}
	

}


 class Sub extends Demo{
	public Integer test() {/*only nonprimitive can be changed not primitive*/
		return new Integer(10);
	}
	

}

 class Sub2 extends Demo{
		public Double test() {
			return new Double(10);
		}
		

	}
