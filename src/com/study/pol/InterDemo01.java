package com.study.pol;

interface USB{
	//因为在接口中都是抽象方法，所以会自动添加abstract，我们可以省略
	void start();
	void stop();
}

class C{
	public static void work(USB u){
		u.start();
		System.out.println("工作中");
		u.stop();
	}
}

class UsbDisk implements USB{
	public void start(){
		System.out.println("U盘开始工作");
	}
	public void stop(){
		System.out.println("U盘停止工作");
	}
}

class Printer implements USB{
	public void start(){
		System.out.println("打印机开始工作");
	}
	public void stop(){
		System.out.println("打印机停止工作");
	}
}
public class InterDemo01 {

	public static void main(String[] args) {
		C.work(new UsbDisk());
		C.work(new Printer());
	}

}
