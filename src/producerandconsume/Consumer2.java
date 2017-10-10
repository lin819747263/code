package producerandconsume;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer2   {

	private PriorityBlockingQueue<Integer> queue= new PriorityBlockingQueue<>();
	private Lock lock=new ReentrantLock();
	private Condition notFull=lock.newCondition();
	private Condition notEmpty=lock.newCondition();
	
	
	public static void main(String[] args) {
		Consumer2 con2=new Consumer2();
		Consumer con= con2.new Consumer();
		Producer pro= con2.new Producer();
		
		con.start();
		pro.start();
	}
	
	class Consumer extends Thread{
		public void run() {
			while(true) {
				lock.lock();
				try {
					while(queue.size()==0) {
						try {
							notEmpty.await();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					Integer i = queue.poll();
					System.out.println("consumer"+i);
					notFull.signal();
				}finally {
					lock.unlock();
				}
			}
		}
		
		
		
	}
	
	class Producer extends Thread{
		int i=0;
		public void run() {
			while(i<10) {
				lock.lock();
				try {
					while(queue.size()==10) {
						try {
							notFull.await();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("producer"+i);
					queue.offer(i++);
					notEmpty.signal();
				}finally {
					lock.unlock();
				}
			}
		}
		
		
		
	}

}
