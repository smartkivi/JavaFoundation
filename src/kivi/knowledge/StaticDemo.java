package kivi.knowledge;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.name="k";
		p.age=1;
		p.graduateFrom="school";
		p.speak();
		
		Person p1=new Person();
		p1.name="v";
		p1.age=2;
		//p1.graduateFrom="school";
		p1.speak();
	}
	
}

class Person{
	static String name;
	int age;
	static String graduateFrom;
	public static void speak() {
		System.out.println(name+"----"+graduateFrom);
	}
}
