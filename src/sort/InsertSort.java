package sort;

import SortUtils.SearchUtils;

public class InsertSort {
	
	 public static void  insertSort(int[] a){
		 for(int i=1;i<a.length;i++){
			 for(int j=i;j>0;j--){
				 if(SearchUtils.less(a[j],a[j-1])){
						SearchUtils.swap(a,j,j-1);
					} 
			 }
			 SearchUtils.show(a);
			 System.out.println();
		 }
	 } 
}
