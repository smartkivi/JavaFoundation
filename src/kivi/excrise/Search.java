package kivi.excrise;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		int[] arr= {5,7,3,2,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("please input the number:");
		int goal=sc.nextInt();
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(goal==arr[i]) {
				index=i;
				break;
			}
		}
		System.out.println("the index of the number:"+index);
		sc.close();
	}
}
