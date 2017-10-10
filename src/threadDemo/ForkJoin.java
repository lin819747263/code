package threadDemo;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

class PrintTask extends RecursiveAction{

	private static final int MAX=50;
	private int start;
	private int end;
	
	PrintTask(int start,int end){
		this.start=start;
		this.end=end;
	}

	@Override
	protected void compute() {
		if((end-start)<MAX) {
			for(int i=start;i<end;i++) {
				System.out.println(Thread.currentThread().getName()+"µÄiÖµ"+i);
			}
		}else {
			int mid=(start+end)/2;
			PrintTask left=new PrintTask(start, mid);
			PrintTask right=new PrintTask(mid, end);
			
			left.fork();
			right.fork();
		}
	}

}

public class ForkJoin{
	public static void main(String[] args) throws Exception {
		ForkJoinPool forkJoinPool=new ForkJoinPool();
		forkJoinPool.submit(new PrintTask(0, 200));
		forkJoinPool.awaitTermination(2, TimeUnit.SECONDS);
		forkJoinPool.shutdown();
	}
}
