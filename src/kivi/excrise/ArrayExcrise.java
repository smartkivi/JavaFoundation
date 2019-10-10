package kivi.excrise;
import java.util.Scanner;
import java.util.Random;
public class ArrayExcrise {
	public static void main(String[] args) {
		int[] arr=new int[4];
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=r.nextInt(100);
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
			System.out.println(arr[i]);
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		sc.close();
	}
}
