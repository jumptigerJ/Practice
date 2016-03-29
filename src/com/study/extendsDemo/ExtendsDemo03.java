package com.study.extendsDemo;

class Father{
	private int age;
	private String name;

	public Father(){
		System.out.println("这是父类构造方法");
	}

}

class Son extends Father{
	
	public Son(){
		System.out.println("这是子类构造方法");
	}
}
public class ExtendsDemo03 {

	public static void main(String[] args) {
		Son s = new Son();

	}

}
