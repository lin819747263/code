package test;

public class SearchTest {
	public static void main(String[] args) {
		
		
		String s1="hello";
		String s2="hell"+"o";
		String s3=new String("hello");
		StringBuilder s4=new StringBuilder("hello");
		///s1="world";
		System.out.println(s1.equals(s3));
		System.out.println(s1=="hell"+"o");
		System.out.println(s2==s3);
		
	}
	
	public static void changeStr(String sd) {
		sd="welcome";
	}
}
