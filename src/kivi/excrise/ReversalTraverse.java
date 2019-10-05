package kivi.excrise;

import java.util.Scanner;

public class ReversalTraverse {
	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		for(int i=0;i<arr.length/2;i++) {
//			int temp=arr[i];
//			arr[i]=arr[arr.length-i-1];
//			arr[arr.length-i-1]=temp;
//		}
		int start=0;
		int end=arr.length-1;
		for(;start<=end;start++,end--) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
