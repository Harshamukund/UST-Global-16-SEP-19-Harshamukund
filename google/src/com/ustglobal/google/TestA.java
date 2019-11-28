package com.ustglobal.google;

public class TestA {

	public static void main(String[] args) {
	Browser b=new Browser();
	Google g1=new Gmail();
	b.open(g1);
	Google g2=new GoogleDrive();
	b.open(g2);

	}

}
