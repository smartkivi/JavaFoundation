package kivi.knowledge;

public class MyString {
	public static void main(String[] args) {
//		String s1=new String("abc");
//		System.out.println(s1);
//		char[] s2= {'a','b','c'};
//		String s3=new String(s2);
//		System.out.println(s3);
//		String s4=new String(s2,0,s2.length);
//		System.out.println(s4);
//		String s5="abc";
//		System.out.println(s5);
		
//		String s="helloworld";
//		System.out.println(s.length());
//		System.out.println(s.charAt(0));
//		System.out.println(s.indexOf("l"));
//		System.out.println(s.substring(3));
//		System.out.println(s.substring(2,6));
		
//		String s="abcde";
//		char[] chs=s.toCharArray();
//		for(int i=0;i<chs.length;i++) {
//			System.out.print(chs[i]);
//		}
//		System.out.println();
//		System.out.println("HELLOWORLD".toLowerCase());
//		System.out.println("helloworld".toUpperCase());

		String s1="helloworld";
		String s2="   helloworld   ";
		String s3=" hello world  ";
		System.out.println(s1.trim());
		System.out.println(s2.trim());
		System.out.println(s3.trim());
		String s4="aa,bb,cc";
		String[] strArray=s4.split(",");
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
	}
}
