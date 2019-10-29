package kivi.excrise;

public class TestException {
	public static void main (String[] args) throws MyException{
		try{
			check(120);
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
		}
		
//		System.out.println(flag);
	}
	
	public static void check(int score) throws MyException{
		if(score<0||score>100) {
			throw new MyException("illegal");
		}
		System.out.println("end");
	}
}
