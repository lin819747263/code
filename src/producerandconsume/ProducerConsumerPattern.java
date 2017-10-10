package producerandconsume;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerPattern {
	public static void main(String[] args) {
		BlockingQueue sharedQueue=new LinkedBlockingQueue();
		
		Thread proThread=new Thread(new Producer(sharedQueue));
		Thread conThread=new Thread(new Consumer(sharedQueue));
		
		
		proThread.start();
		conThread.start();
		
	}
}
