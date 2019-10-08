package kivi.object;

public class Student {
	private String name;
	private int age;
	
	public void setAge(int a) {
		if(a<0||a>100) {
			System.out.println("input error!!!!");
		}else {
			this.age=a;
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void study() {
		System.out.println("study");
	}
	
	public void show() {
		System.out.println("name:"+name+"and age:"+age);
	}
	
	public void eat() {
		System.out.println("eat");
	}
	
	 public Student(){
		 //System.out.println("student");
	 }
	 
	 public Student(String name,int age) {
		 this.name=name;
		 this.age=age;
	 }
}
