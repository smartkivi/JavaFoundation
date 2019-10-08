package kivi.object;
import java.util.*;
public class StudentManager {
	public static void main(String[] args) {
		ArrayList<Student> arr=new ArrayList<Student>();
		
		while(true) {
			System.out.println("-----------欢迎来到学生管理系统---------");
			System.out.println("1 查看所有学生");
			System.out.println("2 添加学生");
			System.out.println("3 删除学生");
			System.out.println("4 修改学生");
			System.out.println("5 退出");
			Scanner sc=new Scanner(System.in);
			System.out.print("输入你的选择：");
			int choice=sc.nextInt();
			switch(choice) {
				case 1:
					browse(arr);
					break;
				case 2:
					add(arr);
					break;
				case 3:
					delete(arr);
					break;
				case 4:
					modify(arr);
					break;
				case 5:
					exit();
					break;
			}
		}
	}
	
	public static void browse(ArrayList<Student> arr) {
		if(arr.size()==0) {
			System.out.println("没有学生数据");
			return;
		}
		System.out.println("name\tage\t");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i).getName()+"\t"+arr.get(i).getAge());
		}
	}
	
	public static void add(ArrayList<Student> arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("学生个数？");
		int total=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<total;i++) {
			Student stu=new Student();
			System.out.println("请输入学生数据:");
			while(true) {
				boolean flag=true;
				System.out.print("name:");
				String str=sc.nextLine();
				for(int j=0;j<arr.size();j++) {
					//System.out.println(arr.get(j).getName());
					if(arr.get(j).getName().equals(str)) {
						flag=false;
						break;
					}
				}
				if(flag==true) {
					stu.setName(str);
					break;
				}else {
					System.out.println("请重新输入");
				}
			}
			
			System.out.print("age:");
			stu.setAge(sc.nextInt());
			sc.nextLine();
			arr.add(stu);
			//System.out.println(arr.size());
		}
	}
	
	public static void delete(ArrayList<Student> arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入删除学生名字：");
		String str=sc.nextLine();
		int index=-1;
		for(int i=0;i<arr.size();i++) {
			Student s=arr.get(i);
			if(s.getName().equals(str)) {
				index=i;
			}
		}
		if(index==-1) {
			System.out.println("不存在该学生数据");
		}else {
			arr.remove(index);
		}
	}
	
	public static void modify(ArrayList<Student> arr) {
		Scanner sc=new Scanner(System.in);
		Student stu=new Student();
		System.out.println("请输入需要修改的学生名字");
		String str=sc.nextLine();
		System.out.println("需要修改的学生名字为"+str);		
				
		int index=-1;
		for(int i=0;i<arr.size();i++) {
			Student s=arr.get(i);
			if(s.getName().equals(str)) {
				index=i;
			}
		}
		if(index==-1) {
			System.out.println("不存在该学生数据");
		}else {
			System.out.println("请输入学生名字:");
			String name=sc.nextLine();
			stu.setName(name);
			System.out.println("请输入学生年龄:");
			int age=sc.nextInt();
			stu.setAge(age);
			arr.set(index,stu);
		}
	}
	
	public static void exit() {
		System.out.println("Thank you for using!");
		System.exit(0);
	}
}
