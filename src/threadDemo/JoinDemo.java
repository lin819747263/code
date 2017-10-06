package threadDemo;

public class JoinDemo {
	public volatile static int i=0;
	
	public static class AddThread extends Thread{
		public void run() {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("˧˧");
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		AddThread at=new AddThread();
		at.start();
		//at.join();
		System.out.println(i);
	}
}
