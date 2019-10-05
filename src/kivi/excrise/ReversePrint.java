package kivi.excrise;
import java.util.Scanner;
public class ReversePrint {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[6];
		int count=0;
		while(num!=0) {
			arr[count++]=num%10;
			num/=10;
		}
		System.out.print(count+" ");
		for(int i=0;i<count;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
