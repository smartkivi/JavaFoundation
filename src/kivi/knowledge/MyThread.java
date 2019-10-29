package kivi.knowledge;

//public class MyThread extends Thread{
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(getName()+":"+i);
//		}
//	}
//}

public class MyThread implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}