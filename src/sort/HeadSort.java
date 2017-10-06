package sort;

import java.util.Arrays;

import SortUtils.SearchUtils;

public class HeadSort {
	
	public static void hsort(int[] a){
		int N=a.length;
		for(int i=0;i<N;i++){
			buildMaxHaep(a, N-1-i);
			SearchUtils.swap(a, 0, N-1-i);
			System.out.println(Arrays.toString(a));
			
		}
		
		
	}
	
	
	public static void buildMaxHaep(int[] data,int lastIndex){
		for(int i=(lastIndex-1)/2;i>=0;i--){
			int k=i;
			while(2*k+1<lastIndex){
				int bigger=2*k+1;
				if(bigger<lastIndex){
					
					if(data[bigger]<data[bigger+1]){
						bigger++;
						
						
					}
				}
				
				if(data[k]<data[bigger]){
					SearchUtils.swap(data, k, bigger);
					k=bigger;
				}else{
					break;
				}
			}
			
		}
	}
}
