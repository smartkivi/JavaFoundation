package kivi.excrise;
import java.util.Scanner;
public class UpLow {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=s.substring(0,1);
		String s2=s.substring(1);
		System.out.println(s1.toUpperCase()+s2.toLowerCase());
		sc.close();
	}
}
