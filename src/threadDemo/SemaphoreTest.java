package threadDemo;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	static class Parking{
		private Semaphore semaphore;
		
		Parking(int count) {
			 semaphore=new Semaphore(count);
		}
		public void park() {
			try {
				semaphore.acquire();
				long time=(long)Math.random()*10;
				System.out.println(Thread.currentThread().getName()+"进入停车场停车"+time+"秒");
				Thread.sleep(time);
				System.out.println(Thread.currentThread().getName()+"离开停车场");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				semaphore.release();
			}
		} 
		 
	}
	
	static class Car extends Thread{
		Parking parking;
		Car(Parking parking){
			this.parking=parking;
		}
		public void run() {
			parking.park();
		}
	}
	
	public static void main(String[] args) {
		Parking parking=new Parking(5);
		
		for(int i=0;i<15;i++) {
			new Car(parking).start();
		}
	}
}
