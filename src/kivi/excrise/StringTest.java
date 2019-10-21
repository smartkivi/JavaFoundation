package kivi.excrise;
import java.util.Scanner;
public class StringTest {
	public static void main(String[] args) {
		//String un="kivi";
		String pw="kivi";
		Scanner sc=new Scanner(System.in);
		System.out.print("please input your account:");
		String account=sc.nextLine();
		System.out.println("account:"+account);
		boolean flag=false;
		int count=3;
		while(flag==false && count>0) {
			System.out.print("please input your password:");
			String password=sc.nextLine();
			if(password.equals(pw)) {
				flag=true;
				System.out.println("success");
			}else {
				count--;
				if(count>0) {
					System.out.println(count+" chance to input!!!");
				}
				else {
					System.out.println("your account has been locked");
				}
			}
		}
		sc.close();
	}
}
