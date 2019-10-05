package kivi.excrise;

public class ExcrisePalindrome {
	public static void main(String[] args) {
		int count=0;
		for(int i=10000;i<100000;i++) {
			int units=i%10;
			int tens=(i/10)%10;
//			int hundreds=(i/100)%10;
			int thousands=(i/1000)%10;
			int tenofthousands=(i/10000)%10;
			if(units==tenofthousands && tens==thousands) {
				count++;
				System.out.println(count+" Palindrome:"+i);
			}
		}
	}
}
