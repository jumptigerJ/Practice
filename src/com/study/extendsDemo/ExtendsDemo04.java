package com.study.extendsDemo;

class E{
	public void tell(){
		System.out.println("����һ��tell����");
	}
}

class B extends E{
	public void tell(){
		super.tell();   //ǿ�е� �ø���ķ���
		System.out.println("��Ҫ��дtell����");
	}
}

public class ExtendsDemo04 {

	public static void main(String[] args) {
		B b = new B();
		b.tell();

	}

}
