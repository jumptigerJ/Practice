package com.study.fni;

interface Inter1{
	public static final int AGE = 100;//公共的全局常量   常量命名规则要大写
	public abstract void tell();
}

interface Inter2{
	public abstract void say();
}

abstract class Abs1{
	public abstract void print();
}
class A extends Abs1 implements Inter1,Inter2{
	public void tell(){
		
	}
	
	public void say(){
		
	}
	
	public void print(){
		
	}
}

interface Inter3 extends Inter1,Inter2{
	
}

public class InterDemo01 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(Inter1.AGE);
	}

}
