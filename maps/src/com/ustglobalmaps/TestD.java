package com.ustglobalmaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lh=new LinkedHashMap<>();
		lh.put("Bangalore", 560068);
		lh.put("Haryana", 123456);
		lh.put("patna", 456743);
		for(Map.Entry<String, Integer> m:lh.entrySet()){
			String key=m.getKey();
			Integer value=m.getValue();
			System.out.println("key is "+key +"-------"+"value is "+value);
			
		}
	}

}
