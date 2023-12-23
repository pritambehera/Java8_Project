package com.j8.check;

public class Test1 {
public static void main(String[] args) {
int[] arr =	{23,8,0,24,17,20,0,0,9};
int n = arr.length;
int j =0;
//	List<Integer> list = Arrays.asList(23,8,0,24,17,20,0,0,9);
for(int i =0;i<n;i++) {
	if(arr[i]!=0) {
		swap(arr,j,i);
		j++;
	}
}
for(int i=0;i<n;i++) {
	System.out.print(arr[i]+" ");
}
//	shiftNonZeros(arr,n);

}

	private static void swap(int[] arr, int j, int i) {
	// TODO Auto-generated method stub
	int temp = arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}

	private static void shiftNonZeros(int[] arr,int n) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0;i<n;i++) {
			if(arr[i]!=0)
				arr[count++]=arr[i];
			while(count<n)
				arr[count++]=0;
			
		}
	}

}
