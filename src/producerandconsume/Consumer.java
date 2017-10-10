package producerandconsume;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private final BlockingQueue sharedQueue;
	
	public Consumer(BlockingQueue sharedQueue) {
		this.sharedQueue=sharedQueue;
	}
	@Override
	public void run() {

		while(true) {
			try {
				int i=(int) sharedQueue.take();
				System.out.println("consumer"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
