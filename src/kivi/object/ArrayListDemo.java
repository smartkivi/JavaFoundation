package kivi.object;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
//		ArrayList<String> array=new ArrayList<String>();
//		array.add("kivi");
//		array.add("is");
//		array.add(2,"smart");
//		System.out.println(array);
//		for(int i=0;i<array.size();i++) {
//			System.out.println(array.get(i));
//		}
		
//		ArrayList<Student> arr=new ArrayList<Student>();
//		Student stu1=new Student("kivi",22);
//		Student stu2=new Student("wiki",120);
//		arr.add(stu1);
//		arr.add(stu2);
//		for (int i = 0; i < arr.size(); i++) {
//			System.out.println(arr.get(i).getName()+" "+arr.get(i).getAge());
//		}
		
		ArrayList<Student> arr=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		sc.nextLine();
		System.out.println("total:"+total);
		Student[] stu=new Student[total];
		for(int i=0;i<stu.length;i++) {
			stu[i]=new Student();
			System.out.println("name:");
			String s=sc.nextLine();
			stu[i].setName(s);
			System.out.println("age:");
			int a=sc.nextInt();
			sc.nextLine();
			stu[i].setAge(a);
		}
		for(int i=0;i<stu.length;i++) {
			arr.add(stu[i]);
		}
		for(int i=0;i<arr.size();i++) { 
			System.out.println("name:"+arr.get(i).getName()+" age:"+arr.get(i).getAge());
		}
		sc.close();
	}
}
