package binarysearch;

public class Test {

	public static void main(String[] args) {
	
		int a[]=new int[] {1,2,3,4,5,6,7,8,9};
		int i = BinarySearch.BSearch(a, 0, a.length-1, 5);
		int j= BinarySearch.BSearch2(a,  5);
		System.out.println(i);
		System.out.println(j);
	}
}
