package sort;

import SortUtils.SearchUtils;

public class BubbleSort {
	
	public static void bubbleSort(int[] a){
		for (int i = 0; i < a.length; i++) {
			for (int j =a.length-1; j >=1; j--) {
				if(SearchUtils.less(a[j],a[j-1])){
					SearchUtils.swap(a,j,j-1);	
				}
			}
			SearchUtils.show(a);
			System.out.println();
		}
	}
}
