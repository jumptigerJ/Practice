package com.study.fni;

abstract class Abs{
	private int age;
	public void tell(){
		
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	//³éÏó·½·¨
	public abstract void say();
}
class AbsDemo extends Abs{
	public void say(){
		System.out.println(this.getAge());
	}
}

public class AbsDemo01 {

	public static void main(String[] args) {
		AbsDemo a = new AbsDemo();
		a.setAge(20);
		a.say();
	}

}
