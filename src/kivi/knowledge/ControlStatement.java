package kivi.knowledge;
import java.util.Scanner;
public class ControlStatement {
	public static void main(String[] args) {
		System.out.println("start");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int s;
//		int b=sc.nextInt();
//		if(a==b) {
//			System.out.println("a=b");
//		}

		if(a>3)
		{
			s=a+1;
		}
		else if(a<1){
			s=a*100;
		}
		else {
			s=a;
		}
		System.out.println("s:"+s);
		System.out.println("end");
		sc.close();
	}
	
}
