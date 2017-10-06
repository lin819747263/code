package threadDemo;

public class deathLock {
	private static Object o1=new Object();
	private static Object o2=new Object();
	public static void main(String[] args) {
		new Thread() {
			public void run(){
				synchronized (o1) {
					System.out.println("thread1 get lock1");
					try {
						Thread.sleep(100);
					}catch(Exception e) {
						e.printStackTrace();
					}
					synchronized (o2) {
						System.out.println("thread1 get lock2");
					}
					
				}
			}
			
		}.start();
		
		new Thread() {
			public void run(){
				synchronized (o2) {
					System.out.println("thread2 get lock2");
					try {
						Thread.sleep(100);
					}catch(Exception e) {
						e.printStackTrace();
					}
					synchronized (o1) {
						System.out.println("thread1 get lock1");
					}
					
				}
			}
			
		}.start();
		
	}
	
	
	
}
