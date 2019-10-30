package kivi.excrise;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(Recurrence(20));
	}
	
	public static int Recurrence(int month) {
		if(month==1 || month==2) {
			return 1;
		}
		return Recurrence(month-1)+Recurrence(month-2);
	}

}


