package com.study.pol;

abstract class Person{
	private int age;
	private String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void want(); 
}

class Student extends Person{
	private int score;
	
	public Student(int age, String name, int score) {
		super(age, name);
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void want(){
		System.out.println("名字:" + getName() +" 年龄:" + getAge() + " 成绩:" + getScore());
	}
}

class Worker extends Person{
	private int money;

	public Worker(int age, String name, int money) {
		super(age, name);
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void want(){
		System.out.println("名字:" + getName() +" 年龄:" + getAge() + " 成绩:" + getMoney());
	}
}

public class AbsDemo01 {

	public static void main(String[] args) {
		Student stu = new Student(10,"小明",99);
		stu.want();
		
		Worker w = new Worker(20,"大明",10000);
		w.want();

	}

}
