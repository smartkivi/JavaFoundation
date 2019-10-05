package kivi.knowledge;
import java.util.Random;
import java.util.Scanner;
public class RandomDemo {
	public static void main(String[] args) {
		Random r=new Random();
		int s=r.nextInt(100)+1;
		System.out.println("number:"+s);

		while(true) {
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			if(x==s) {
				System.out.println("���");
				break;
			}else {
				System.out.println("�����");
			}
			sc.close();
		}
		
	}
}
