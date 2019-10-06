package kivi.object;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone p=new Phone();
		p.brand="iphone";
		p.price=5000;
		p.color="black";
		System.out.println("brand:"+p.brand);
		System.out.println("price:"+p.price);
		System.out.println("color:"+p.color);
		p.call("kivi");
		p.sendMessage();
	}
}
