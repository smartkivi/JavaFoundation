package kivi.object;

public class Phone {
	String brand;
	String color;
	int price;
	public void call(String name) {
		System.out.println("call "+name);
	}
	public void sendMessage() {
		System.out.println("send message");
	}
}
