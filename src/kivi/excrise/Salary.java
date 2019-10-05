package kivi.excrise;
import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {
		int[] salary= {100,50,20,10,5,2,1};
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<num;i++) {
			for(int j=0;j<7;j++) {
				if(salary[j]<=arr[i]) {
					count+=arr[i]/salary[j];
					arr[i]=arr[i]%salary[j];
				}
				if(arr[i]==0) {
					break;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
