package SortUtils;

public class SearchUtils {
	
	
	public static boolean less(int a, int b){
		if(a<b){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * 
	 * 
	 * @param a
	 * @param i
	 * @param j
	 */
	static public  void swap(int[] a,int i,int j){
		int t=a[i];
		a[i]=a[j] ;
		a[j]=t;
		
	}
	/**
	 * 
	 * 
	 * @param a
	 */
	public static void show(int[] a){
		 for (int i : a) {
			 System.out.print(i+" ");
		}
			
	}
	
	
}
