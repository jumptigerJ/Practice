package com.study.pol;

class A{
	public void tell1(){
		System.out.println("A--tell1()");
	}
	public void tell2(){
		System.out.println("A--tell2()");
	}
}

class B extends A{
	public void tell1(){
		System.out.println("B--tell1()");
	}
	public void tell3(){
		System.out.println("B--tell3()");
	}
}
public class PolDemoo1 {

	public static void main(String[] args) {
		// 向上转型
//		B b = new B();
//		A a = b;
//		a.tell1();
//		a.tell2();
		//向下转型
		A a = new B();
		B b = (B)a;
		b.tell1();
		b.tell2();
		b.tell3();
		

	}

}
