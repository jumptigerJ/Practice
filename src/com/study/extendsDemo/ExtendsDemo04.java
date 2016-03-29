package com.study.extendsDemo;

class E{
	public void tell(){
		System.out.println("这是一个tell方法");
	}
}

class B extends E{
	public void tell(){
		super.tell();   //强行调 用父类的方法
		System.out.println("我要重写tell方法");
	}
}

public class ExtendsDemo04 {

	public static void main(String[] args) {
		B b = new B();
		b.tell();

	}

}
