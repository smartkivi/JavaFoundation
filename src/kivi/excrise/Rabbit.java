package kivi.excrise;

public class Rabbit {
	public static void main(String[] args) {
		int first=1;
		int second=1;
		int last=2;
		for(int i=3;i<=20;i++) {
			last=first+second;
			first=second;
			second=last;
		}
		System.out.println(last);
	}
}
