package producerandconsume;

import java.util.concurrent.PriorityBlockingQueue;

public class Consumer1{
	PriorityBlockingQueue<Integer> queue=new PriorityBlockingQueue<>();

	public static void main(String[] args) {
		Consumer1 con1=new Consumer1();
		Consumer con= con1.new Consumer();
		Producer pro= con1.new Producer();
		
		con.start();
		pro.start();
	}
	class Consumer extends Thread {
		
		public void run() {
			while(true) {
				synchronized (queue) {
					while(queue.size()==0) {
						try {
							queue.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
							queue.notify();
						}
					}
					Integer i = queue.poll();
					System.out.println("consumer消费了"+i);
					queue.notify();
				}
			}
		
		}
	
	}
	class Producer extends Thread{
		int i=0;
		public void run(){
			while(i<10) {
				synchronized (queue) {
					while(queue.size()==10) {
						try {
							queue.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
							queue.notify();
						}
					}
					System.out.println("producer生产了"+i);
					queue.offer(i++);
					queue.notify();
				}
			}
		}
	}
}
