package com.study.extendsDemo;

class Father{
	private int age;
	private String name;

	public Father(){
		System.out.println("���Ǹ��๹�췽��");
	}

}

class Son extends Father{
	
	public Son(){
		System.out.println("�������๹�췽��");
	}
}
public class ExtendsDemo03 {

	public static void main(String[] args) {
		Son s = new Son();

	}

}
