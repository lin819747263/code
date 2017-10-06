package single;

public class LockSingleton {
	private static volatile LockSingleton instance;
	private LockSingleton() {}
	public static LockSingleton getIntance4() {
		if(instance==null) {
			synchronized (LockSingleton.class) {
				if(instance==null) {
					instance=new LockSingleton();
				}
			}
		}
		return instance;
	}
}
