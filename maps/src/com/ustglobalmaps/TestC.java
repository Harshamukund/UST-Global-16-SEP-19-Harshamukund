package com.ustglobalmaps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lh=new LinkedHashMap<>();
		lh.put("Bangalore", 560068);
		lh.put("Haryana", 123456);
		lh.put("patna", 456743);
		System.out.println(lh);
		Set<String> s=lh.keySet();
		for(String key:s) {
			System.out.println("key "+s);
		}
		Collection<Integer> c=lh.values();
		for(Integer value:c) {
			System.out.println("values "+value);
		}

		

		

	}

}
