package sort;

import SortUtils.SearchUtils;

public class QuickSort {
	
	public static void qSort(int[] a){
		 
		 sort(a, 0, a.length-1);
	 }
	/**
	 * 
	 * 
	 * @param a
	 * @param lo
	 * @param hi
	 */
	public static void sort(int[] a,int lo,int hi){
		if(lo>=hi) return;
		int j=parttation(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}
	/**
	 * 
	 * ÇÐ·Ö
	 * @param a
	 * @param lo
	 * @param hi
	 * @return
	 */
	public static int parttation(int[] a,int lo,int hi){
		int i=lo,j=hi+1;
		int v=a[i];
		while(true) {
			while(SearchUtils.less(a[++i], v)) {
				if(i==hi)
					break;
			}
			while(SearchUtils.less(v, a[--j])) {
				if(j==lo)
					break;
			}
		
			if(i>=j)
				break;
			SearchUtils.swap(a, i, j);
		}
		SearchUtils.swap(a, lo, j);
		return j;
		
	}
		
}
