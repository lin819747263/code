package sort;

import SortUtils.SearchUtils;

public class Shell {

	 /***
	  * 
	  * 
	  * Ï£¶ûÅÅÐò
	  */
	 public static void shellSort(int[] a){
		 int N=a.length;
		 int h=1;
		 while(h<(N/3)){
			 h=h*3+1;
		 }
		 while(h>=1){
			 for(int i=h;i<N;i++){
				 for(int j=i;j>=h&&SearchUtils.less(a[j],a[j-h]);j-=h){
					 SearchUtils.swap(a,j,j-h);
				 }
			 }
			 h/=3;
		 }
	 }
}
