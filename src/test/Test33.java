package test;

public class Test33 {

	public static void main(String[] args) {
		new B().say();
	}
	
}
class A{
	
	static{
		System.out.println("���ྲ̬�����ִ��");
	}
	A(){
		System.out.println("���๹����ִ��");
	}
	{
		System.out.println("��������ִ��");
	}
	public void say() {
		System.out.println("������ͨ����");
	}
	
}

class B extends A{
	{
		System.out.println("��������ִ��");
	}
	
	static{
		System.out.println("���ྲ̬�����ִ��");
	}
	
	B(){
		System.out.println("���๹����ִ��");
	}
	public void say() {
		System.out.println("������ͨ����");
	}
	
	
}