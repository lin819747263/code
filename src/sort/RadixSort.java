package sort;

import java.util.Arrays;

import SortUtils.SearchUtils;

public class RadixSort {

public static void rSort(int[] a,int radix,int d){
	int[] temp=new int[a.length];
	int[] count=new int[radix];
	
	int rate=1;
	for(int i=0;i<d;i++){
		Arrays.fill(count, 0);
		System.arraycopy(a, 0, temp, 0, a.length);
		for (int j = 0; j < a.length; j++) {
			int subKey=(temp[j]/rate)%radix;
			count[subKey]++;
		}
		for (int j = 1; j < radix; j++) {
			count[j]=count[j]+count[j-1];
		}
		SearchUtils.show(count);
		System.out.println();
		
		for(int m=a.length-1;m>=0;m--){
			int subKey=(temp[m]/rate)%radix;
			a[--count[subKey]]=temp[m];
		}
		rate*=radix;
	}
}
	
}
