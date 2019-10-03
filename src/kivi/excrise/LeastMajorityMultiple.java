package kivi.excrise;
import java.util.Scanner;
public class LeastMajorityMultiple {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		if(leastMajorityMultiple(a,b,c,d,e)!=-1) {
			System.out.println("multiple:"+leastMajorityMultiple(a,b,c,d,e));
		}
		sc.close();
	}
	
	public static int leastMajorityMultiple(int a,int b,int c,int d,int e){
		int multiple=-1;
		long top=a*b*c*d*e;
		for(int i=4;i<top;i++) {
			int flag=0;
			if(i%a==0) {
				flag++;
			}
			if(i%b==0) {
				flag++;
			}
			if(i%c==0) {
				flag++;
			}
			if(i%d==0) {
				flag++;
			}
			if(i%e==0) {
				flag++;
			}
			if(flag>2) {
				multiple=i;
				break;
			}
		}
		return multiple;
	}
}
