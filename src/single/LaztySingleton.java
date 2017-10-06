package single;
/**
 * ��������ʽд��
 * @author lin819747263
 *
 */
public class LaztySingleton {
	private static LaztySingleton singleton;
    private LaztySingleton() {}
	public LaztySingleton getInstance() {
		if(singleton==null) {
			singleton=new LaztySingleton();
		}
		return singleton;
	}
}
