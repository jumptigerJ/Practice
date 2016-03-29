package com.study.pol;

interface USB{
	//��Ϊ�ڽӿ��ж��ǳ��󷽷������Ի��Զ����abstract�����ǿ���ʡ��
	void start();
	void stop();
}

class C{
	public static void work(USB u){
		u.start();
		System.out.println("������");
		u.stop();
	}
}

class UsbDisk implements USB{
	public void start(){
		System.out.println("U�̿�ʼ����");
	}
	public void stop(){
		System.out.println("U��ֹͣ����");
	}
}

class Printer implements USB{
	public void start(){
		System.out.println("��ӡ����ʼ����");
	}
	public void stop(){
		System.out.println("��ӡ��ֹͣ����");
	}
}
public class InterDemo01 {

	public static void main(String[] args) {
		C.work(new UsbDisk());
		C.work(new Printer());
	}

}
