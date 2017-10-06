package threadDemo;

import java.util.concurrent.CyclicBarrier;

class CyclicBarrierDemo {
	public static void main(String[] args) {
		CyclicBarrier cb=new CyclicBarrier(5, ()-> {
			System.out.println("cb finished");
		});
		
		long start=System.currentTimeMillis();
		for(int i=0;i<10;i++) {
			new Thread( ()->{
				try {
					cb.await();
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(String.format("ºÄÊ±£º%sms", System.currentTimeMillis()-start));
			}).start();
		}
	}
	
	
	
}
