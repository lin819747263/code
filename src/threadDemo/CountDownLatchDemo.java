package threadDemo;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
	
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch cdl=new CountDownLatch(5);
		
		long start=System.currentTimeMillis();
		for(int i=0;i<10;i++) {
			new Thread() {
				public void run() {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						cdl.countDown();
					}
				}
			}.start();
		}
		cdl.await();	
		System.out.println(cdl.getCount());
		System.out.println(String.format("ºÄÊ±£º%sms", System.currentTimeMillis()-start));
	}
}
