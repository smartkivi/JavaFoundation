package kivi.object;

public class Student {
	private String id;
	private String address;
	private String name;
	private int age;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
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
	 
	 public Student(String id,String name,int age,String address) {
		 this.name=name;
		 this.age=age;
		 this.id=id;
		 this.address=address;
	 }
}
