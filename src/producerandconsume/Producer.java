package producerandconsume;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	private final BlockingQueue sharedQueue;
	
	public Producer(BlockingQueue sharedQueue) {
		this.sharedQueue=sharedQueue;
	}
	
	@Override
	public void run() {

		for(int i=0;i<10;i++) {
			try {
				System.out.println("producer"+i);
				sharedQueue.put(i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	
	
	
	
}
