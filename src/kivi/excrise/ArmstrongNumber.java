package kivi.excrise;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int armstrong=sc.nextInt();
		int backup=armstrong;
		boolean flag=true;
		int sum=0;
		while(armstrong!=0) {
			int mod=armstrong%10;
			sum+=mod*mod*mod;
			armstrong/=10;
		}
		if(sum!=backup) {
			flag=false;
		}
		if(flag) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not Armstrong number");
		}
		sc.close();
	}
}
