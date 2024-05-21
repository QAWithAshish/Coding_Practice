package array;

public class MaxMinArray {

	public static void main(String[] args) {
		
		int a[]= {13,44,596,555,2};
		
		int max1,max2;
		max1=max2=a[0];
		
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}else if(a[i]>max2){
				
			max2=a[i];
		
			}
		}
		System.out.println(max1);
		
	}
}
