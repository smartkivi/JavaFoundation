package kivi.excrise;

import java.util.Scanner;

public class SwitchExcrise {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		switch(day) {
		   	case 1:
			   System.out.println("����һ");
			   break;
		   	case 2:
			   System.out.println("���ڶ�");
			   break;
		   	case 3:
			   System.out.println("������");
			   break;
		   	case 4:
			   System.out.println("������");
			   break;
		   	case 5:
			   System.out.println("������");
			   break;
		   	case 6:
			   System.out.println("������");
			   break;
		   	case 7:
			   System.out.println("������");
			   break;
			default:
				System.out.println("�Ƿ�����");
				break;
		}
		sc.close();
	}
}
