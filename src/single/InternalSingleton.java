package single;

public class InternalSingleton {
	private static class SingletonHolder{
		private final static InternalSingleton INSTANCE
								=new InternalSingleton();
		
	}
	private InternalSingleton() {}
	public static InternalSingleton getIntance() {
		return SingletonHolder.INSTANCE;
	}
	
}
