package com.ustglobal.collectionframework.list;

public class Student {
int id;
String name;
double percentege;
public Student(int id, String name, double percentege) {
	super();
	this.id = id;
	this.name = name;
	this.percentege = percentege;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", percentege=" + percentege + "]";
}



}
