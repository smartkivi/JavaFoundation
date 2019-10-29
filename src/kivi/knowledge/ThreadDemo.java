package kivi.knowledge;

public class ThreadDemo {
	public static void main(String[] args) {
//		MyThread mt=new  MyThread();
//		mt.setName("first");
//		mt.start();		
//		
//		MyThread mt1=new  MyThread();
//		mt1.setName("second");
//		mt1.start();	
		
		MyThread mt=new  MyThread();
		Thread t=new Thread(mt);
		t.setName("first");
		t.start();
		
		MyThread mt2=new  MyThread();
		Thread t2=new Thread(mt2);
		t2.setName("second");
		t2.start();
	}
}
