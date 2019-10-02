package kivi.excrise;
import java.util.Scanner;
public class Encode {
	public static void main(String[] args) {
		int[] arr=new int[4];
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		arr[0]=num%10;
		arr[1]=(num/10)%10;
		arr[2]=(num/100)%10;
		arr[3]=(num/1000)%10;
		for(int i=0;i<arr.length;i++) {
			arr[i]=(arr[i]+5)%10;
		}
		exchange(arr,0,3);
		exchange(arr,1,2);
		int encodeNum=arr[0]+arr[1]*10+arr[2]*100+arr[3]*1000;
		System.out.println(encodeNum);
	}
	
	public static void exchange(int[] arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
