package kivi.excrise;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=0;
		int sum=0;
		for(int i=2;;i++) {
			boolean flag=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
				}
			}
			if(flag==true) {
				count++;
				sum+=i;
			}
			if(count==N) {
				break;
			}
		}
		System.out.println("sum:"+sum);
		sc.close();
	}
}
