package binarysearch;

public class BinarySearch {

	
	public static int BSearch(int[] a,int lo,int hi,int target) {
		int mid=(lo+hi)/2;
		
		if(a[mid]==target)
			return mid;
		if(a[mid]>target) {
			return BSearch(a, lo, mid-1, target);
		}
		if(a[mid]<target) {
			return BSearch(a, mid+1, hi, target);
		}
		return -1;
		
	}
	
	public static int BSearch2(int[] a,int target) {
		int lo=0;int hi=a.length-1;
		int mid;
		while(lo<=hi) {
			mid=(lo+hi)/2;
			if(target==a[mid])
				return mid;
			if(target<a[mid])
				hi=mid-1;
			if(target>a[mid])
				lo=mid+1;
		}
		return -1;
		
	}
	
}
