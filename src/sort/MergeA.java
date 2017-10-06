package sort;

import SortUtils.SearchUtils;

public class MergeA {
	private static int[] aux;
	
	public static void sort(int[] a) {
		aux=new int[a.length];
		sort(a,0,a.length-1);
	}

	private static void sort(int[] a, int lo, int hi) {
		if(lo>=hi) return;
		int mid=lo+(hi-lo)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		merge(a, lo, mid, hi);
		SearchUtils.show(a);
		System.out.println();
	}
	
	
	public static void merge(int[] a,int lo,int mid,int hi){
		int i=lo,j=mid+1;
		for (int k = lo; k <= hi; k++) {
			aux[k]=a[k];
		}
		for (int k = lo; k <= hi; k++) {
			if(i>mid) 					a[k]=aux[j++];
			else if(j>hi)				a[k]=aux[i++];
			else if(SearchUtils.less(aux[j],aux[i])) 	a[k]=aux[j++];
			else						a[k]=aux[i++];
		}
	}

}
