package sort;

import SortUtils.SearchUtils;

public class SelectSort {
	
	
	public  static void selectSort(int  a[]){
		for (int i = 0; i < a.length; i++) {
			int min=i;
			for (int j = i+1; j < a.length; j++) {
				if(SearchUtils.less(a[j],a[min])){
					min=j;
				}
			}
			SearchUtils.swap(a,min,i);
			SearchUtils.show(a);
			System.out.println();
		}
	}
}
