package kivi.excrise;
import java.util.Scanner;
public class StringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
//		String strFinal=new String();
//		for(int i=str.length()-1;i>=0;i--) {
//			strFinal+=ch[i];
//			//System.out.print(ch[i]);
//		}
		for(int start=0,end=str.length()-1;start<=end;start++,end--) {
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
		}
		String strFinal=new String(ch);
		for(int i=str.length()-1;i>=0;i--) {
			strFinal+=str.charAt(i);
		}
		System.out.println(strFinal);
		sc.close();
	}
}
