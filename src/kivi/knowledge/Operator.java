package kivi.knowledge;

public class Operator {
	public static void main(String[] args)
	{
//		int a=3;
//		int b=4;
//		int c=a+b;
//		System.out.println(c);
//		
//		byte bb=2;
//		int cc=5;
//		System.out.println(bb+cc);
//		
//		//byte dd=bb+cc;
//		int ee=bb+cc;
//		//System.out.println(dd);
//		System.out.println(ee);
		
//		int a = 10;
//		int b = 20;
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(b%a);
		
		int a=3;
		int b=4;
		int c=5;
		
		//两个比较大小
		boolean flag=(a==b)?true:false;
		System.out.println("flag:"+flag);
		
		//三个数最大值
		int temp=(a>b)?a:b;
		int max=(temp>c)?temp:c;
		System.out.println(max);
	}
}
