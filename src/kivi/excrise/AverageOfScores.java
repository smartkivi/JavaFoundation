package kivi.excrise;
import java.util.Scanner;
public class AverageOfScores {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		int max=0;
		int min=101;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		int average=0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i]!=max)&&arr[i]!=min) {
				average+=arr[i];
			}
		}
		average=average/4;
		System.out.println("average:"+average);
		sc.close();
	}
}
