package kivi.excrise;
import java.util.*;
public class LongestCommonSubstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String temp=null;
		if(s1.length()<s2.length()) {
			temp=s1;
			s1=s2;
			s2=temp;
		}
		boolean flag=false;
		int max=-1;
		for(int i=0;i<s2.length();i++) {
			for(int start=0,end=s2.length()-i;end<=s2.length();start++,end++) {
				if(s1.contains(s2.substring(start, end)) && (end-start)>=max) {
					System.out.println(s2.substring(start, end));
					max=end-start;
					flag=true;
					break;
				}
			}
//			if(flag==true) {
//				break;
//			}
		}
		sc.close();
	}
}
