package kivi.excrise;
import java.util.*;
public class SymmetricalSting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
		String sre=sb.reverse().toString();
		if(str.equals(sre)) {
			System.out.println("symmetry");
		}
		else {
			System.out.println("not symmetry");
		}
	}
}
