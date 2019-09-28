package kivi.knowledge;

import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int c=sc.nextInt();
//		System.out.println(add(a,b));
//		System.out.println(max(a,b));
//		System.out.println(equals(a,b));
//		System.out.println(maxThree(a,b,c));
//		printTest();
//		printEach(a);
//		flowerPrint();
//		System.out.println("over");
//		System.out.println(compare((byte)10,(byte)20));
		int[] arr= {1,2,3,4,5};
//		traverse(arr);
		findMaxAndMin(arr);
	}
	
	public static int add(int number1,int number2) {
		return number1+number2;
	}
	
	public static int max(int number1,int number2){
		return number1>number2?number1:number2;
	}
	
	public static boolean equals(int number1,int number2) {
		if(number1==number2) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int maxThree(int number1,int number2,int number3) {
		int temp=number1>number2?number1:number2;
		int max=temp>number3?temp:number3;
		return max;
	}
	
	public static void printTest() {
		for(int i=0;i<10;i++) {
			System.out.println("hello world");
		}
	}
	
	public static void printEach(int num) {
		if(num<1) {
			System.out.println("·Ç·¨ÊäÈë");
		}
		else {
			for(int i=1;i<=num;i++) {
				System.out.println("i:"+i);
			}
		}
	}
	
	public static void flowerPrint() {
		for(int i=100;i<1000;i++) {
			int units=i%10;
			int tens=(i/10)%10;
			int hundreds=i/100;
			if(i==units*units*units+tens*tens*tens+hundreds*hundreds*hundreds) {
				System.out.println(i);
			}
		}
	}
	
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static boolean compare(short a,short b) {
//		if(a==b) {
//			return true;
//		}else {
//			return false;
//		}
		System.out.println("short");
		return a==b;
	}
	
	public static boolean compare(int a,int b) {
		System.out.println("int");
		return a==b;
	}
	
	public static boolean compare(long a,long b) {
		System.out.println("long");
		return a==b;
	}
	
	public static boolean compare(byte a,byte b) {
		System.out.println("byte");
		return a==b;
	}
	
	public static void traverse(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i==arr.length-1) {
				System.out.println("]");
			}else {
				System.out.print(",");
			}
		}
	}
	
	public static void findMaxAndMin(int[] arr) {
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}
	
	public static void arraySum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("sum:"+sum);
	}
}
