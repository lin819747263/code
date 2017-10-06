package string;

import java.util.Stack;

public class String1 {

	/***
	 * µÝ¹é·­×ª×Ö·û´®
	 * @param s
	 * @return
	 */
	public static String ReverseString(String s) {
		if(s==null||s.length()==0)
			return s;
		int len=s.length();
		if(len==1) {
			return s;
		}else {
			return ReverseString(s.substring(1)+s.charAt(0));
		}
	}
	/**
	 * ·ÇµÝ¹é·­×ª×Ö·û´®
	 * @param s
	 * @return
	 */
	public static String ReverseString2(String s) {
		if(s==null||s.length()==0)
			return s;
		int len=s.length();
		char[] arr=s.toCharArray();
		for(int i=0;i<len/2;i++) {
			arr[i]=s.charAt(len-1-i);
			arr[len-1-i]=s.charAt(i);
		}
		return new String(arr);
	}
	
	/**
	 * ÀûÓÃÕ»·­×ª×Ö·û´®
	 * @param s
	 * @return
	 */
	public static String ReverseString3(String s) {
		if(s==null||s.length()==0)
			return s;
		Stack<Character> stack=new Stack<>();
		char[] arr=s.toCharArray();
		for (Character c : arr) {
			stack.push(c);
		}
		for(int i=0;i<s.length();i++) {
			arr[i]=stack.pop();
		}
		return new String(arr);
	} 
	
}
