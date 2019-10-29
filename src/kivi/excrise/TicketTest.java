package kivi.excrise;

public class TicketTest {
	public static void main(String[] args) {
		TicketThread tt=new TicketThread();
		Thread t1=new Thread(tt);
		t1.setName("one");
		Thread t2=new Thread(tt);
		t2.setName("two");
		Thread t3=new Thread(tt);
		t3.setName("three");
		t1.start();
		t2.start();
		t3.start();
	}
}
