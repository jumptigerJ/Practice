package com.study.pol;

class A9{
	public void tell1(){
		System.out.println("A--tell1()");
	}
	public void tell2(){
		System.out.println("A--tell2()");
	}
}

class B9 extends A9{
	public void tell1(){
		System.out.println("B--tell1()");
	}
	public void tell3(){
		System.out.println("B--tell3()");
	}
}
public class PolDemo03 {

	public static void main(String[] args) {
		A9 a = new A9();
		
		System.out.println(a instanceof A9);
		System.out.println(a instanceof B9);
		
		A9 a1 = new B9();
		
		System.out.println(a1 instanceof A9);
		System.out.println(a1 instanceof B9);
	

	}

}
