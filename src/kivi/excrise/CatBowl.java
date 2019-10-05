package kivi.excrise;
import java.util.Scanner;
public class CatBowl {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		int[] length=new int[total];
		int[] radium=new int[total];
		for(int i=0;i<total;i++) {
			length[i]=sc.nextInt();
			radium[i]=sc.nextInt();
		}
		for(int i=0;i<total;i++){
			if(length[i]<2*Math.PI*radium[i]) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		sc.close();
	}
}
