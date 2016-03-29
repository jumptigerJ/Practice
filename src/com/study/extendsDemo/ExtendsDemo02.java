package com.study.extendsDemo;

class People{
    private int age;
    public void setAge(int age) {
		this.age = age;
	}
    public int getAge() {
		return age;
	}
}

class Worker extends People{
	
}

class PetWorker extends Worker{
	 public void tell(){
		 System.out.println(getAge());
	 }
}
public class ExtendsDemo02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetWorker w = new PetWorker();
		w.setAge(100);
		w.tell();
		
	}

}
