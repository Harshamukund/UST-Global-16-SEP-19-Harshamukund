package com.ustglobalmaps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {

	public static void main(String[] args) {
	 TreeMap<String,Integer> t=new TreeMap<>();
		t.put("Bangalore", 560068);
		t.put("Haryana", 123456);
		t.put("patna", 456743);
		/*t.put("Mysuru", null);*/
		
		for(Map.Entry<String, Integer>  m:t.entrySet()) {
			String s=m.getKey();
			Integer i=m.getValue();
			System.out.println("key is "+s);
			System.out.println("value is "+i);

		}
		
	}

}
