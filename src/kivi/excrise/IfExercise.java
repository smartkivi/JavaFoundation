package kivi.excrise;
import java.util.Scanner;
public class IfExercise {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int max=(a>b)?a:b;
		System.out.println(max);
		if(max>=90 && max<=100) {
			System.out.println("A");
		}
		else if(max>=80 && max<90) {
			System.out.println("B");
		}
		else if(max>=70 && max<80) {
			System.out.println("C");
		}
		else if(max>=60 && max<70) {
			System.out.println("D");
		}
		else if(max<60) {
			System.out.println("E");
		}
		else {
			System.out.println("invalid input");
		}
		sc.close();
	}
}
