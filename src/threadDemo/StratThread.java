package threadDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class StratThread {
	public static void main(String[] args) throws Exception, Exception {
		Thread t1=new Thread1();
		Thread t2=new Thread(new Thread2());
		
		FutureTask<User> ft=new FutureTask<>(new Thread3<>());
		Thread t3=new Thread(ft);
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println(ft.get());
	}
	
	 static class Thread1 extends Thread{
		 public void run() {
			 System.out.println("thread1 is running");
		 }
		 
	 }
	 static class Thread2 implements Runnable{
		 @Override
		 public void run() {
			 System.out.println("thread2 is running");
		 }
	 }
	 static class Thread3<T> implements Callable<T>{

		@SuppressWarnings("unchecked")
		@Override
		public T call() throws Exception {
			 System.out.println("thread3 is running");
			return (T) new User();
		}
		 
	 }

}
