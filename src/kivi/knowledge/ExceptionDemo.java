package kivi.knowledge;

public class ExceptionDemo {

	public static void main(String[] args) {
//		try {
//			System.out.println(1);
//			System.out.println(2/0);
//			System.out.println(2);
//		}catch(ArithmeticException ae){
//			System.out.println("hello");
//		}
		
		try {
			String s=null;
			System.out.println(s.length());
			int[] arr=new int[5];
			System.out.print(arr[8]);
		} catch (NullPointerException e) {
			System.out.println("nullpointer");
			System.out.println(e.getMessage()+"/"+e.toString());
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("out of bound");
		}catch (Exception e) {
			System.out.println("other exception");
		}

	}
}
