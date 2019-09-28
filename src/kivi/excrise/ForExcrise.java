package kivi.excrise;

public class ForExcrise {
	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			System.out.println(i);
//		}
		
//		for(int i=5;i>=1;i--) {
//			System.out.println(i);
//		}
		
//		int sum=0;
//		for(int i=1;i<=5;i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
//		int sum=0;
//		for(int i=1;i<=100;i++){
//			if(i%2==0) {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
		
		int a,b,c,sum,count=0;
		for(int i=100;i<1000;i++)
		{
			a=i%10;
			b=(i/10)%10;
			c=i/100;
			sum=a*a*a+b*b*b+c*c*c;
			if(sum==i) {
				count++;
				System.out.println("水仙花数:"+i);
			}
		}
		System.out.println("水仙花数个数："+count);
	}
}
