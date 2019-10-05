package kivi.excrise;
import java.util.Scanner;
public class SumOfFraction {
	public static  void main(String[] args) {
		double[] arr=new double[101];
		arr[0]=1;
		arr[1]=2;
		for(int i=2;i<101;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		double sum=0;
		for(int i=1;i<=num;i++) {
			sum+=arr[i]/arr[i-1];
		}
		System.out.println(String.format("%.6f",sum));
		sc.close();
	}
}
