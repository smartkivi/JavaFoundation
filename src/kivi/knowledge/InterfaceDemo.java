package kivi.knowledge;

public class InterfaceDemo {

	public static void main(String[] args) {

	}
	interface Boss{
		public void manage();
	}
	interface  Programmer{
		public void code();
	}
	class Bills implements Boss,Programmer{
		public void code() {
			
		}
		public void manage() {
			 
		}
	}
}
