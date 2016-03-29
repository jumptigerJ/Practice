package com.study.extendsDemo;

class Person{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void tell(){
		System.out.println("����"+getName()+"����"+getAge());
	}
}
class Student extends Person{
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void say(){
		System.out.println("�ɼ���" + getScore());
	}
}
public class ExtendsDemo01 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("����");
		s.setAge(10);
		s.setScore(100);
		s.tell();
		s.say();
	}

}
