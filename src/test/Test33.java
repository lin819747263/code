package test;

public class Test33 {

	public static void main(String[] args) {
		new B();
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
}