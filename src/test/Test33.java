package test;

public class Test33 {

	public static void main(String[] args) {
		new B().say();
	}
	
}
class A{
	
	static{
		System.out.println("父类静态代码块执行");
	}
	A(){
		System.out.println("父类构造器执行");
	}
	{
		System.out.println("父类代码块执行");
	}
	public void say() {
		System.out.println("父类普通方法");
	}
	
}

class B extends A{
	{
		System.out.println("子类代码块执行");
	}
	
	static{
		System.out.println("子类静态代码块执行");
	}
	
	B(){
		System.out.println("子类构造器执行");
	}
	public void say() {
		System.out.println("子类普通方法");
	}
	
	
}