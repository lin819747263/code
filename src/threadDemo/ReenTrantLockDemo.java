package threadDemo;

import java.util.concurrent.locks.ReentrantLock;

public class ReenTrantLockDemo   {

	public static ReentrantLock lock=new ReentrantLock();
	public static volatile int i=0;
	
	public static class Test implements Runnable{
		public void run() {
	
			for(int j=0;j<100000;j++) {
				lock.lock();
				try {
					i++;
				}
				finally {
					lock.unlock();
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		Test test1=new Test();
		Test test2=new Test();
		Thread t1=new Thread(test1);
		Thread t2=new Thread(test2);
		t1.start();
		t2.start();
		t1.join();
		//t2.join();
		System.out.println(i);
	}
}
