package kivi.excrise;

public class CharacterStatistics {
	public static void main(String[] args) {
		String s="123ABCDabc";
		int bigCase=0;
		int littleCase=0;
		int number=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				bigCase++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				littleCase++;
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				number++;
			}else {
				System.out.println("invaild input");
			}
		}
		System.out.println("Big case:"+bigCase);
		System.out.println("Little case:"+littleCase);
		System.out.println("number:"+number);
	}
}
