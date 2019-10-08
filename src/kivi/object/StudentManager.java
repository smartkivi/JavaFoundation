package kivi.object;
import java.util.*;
public class StudentManager {
	public static void main(String[] args) {
		ArrayList<Student> arr=new ArrayList<Student>();
		
		while(true) {
			System.out.println("-----------��ӭ����ѧ������ϵͳ---------");
			System.out.println("1 �鿴����ѧ��");
			System.out.println("2 ���ѧ��");
			System.out.println("3 ɾ��ѧ��");
			System.out.println("4 �޸�ѧ��");
			System.out.println("5 �˳�");
			Scanner sc=new Scanner(System.in);
			System.out.print("�������ѡ��");
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
			System.out.println("û��ѧ������");
			return;
		}
		System.out.println("name\tage\t");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i).getName()+"\t"+arr.get(i).getAge());
		}
	}
	
	public static void add(ArrayList<Student> arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ѧ��������");
		int total=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<total;i++) {
			Student stu=new Student();
			System.out.println("������ѧ������:");
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
					System.out.println("����������");
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
		System.out.println("������ɾ��ѧ�����֣�");
		String str=sc.nextLine();
		int index=-1;
		for(int i=0;i<arr.size();i++) {
			Student s=arr.get(i);
			if(s.getName().equals(str)) {
				index=i;
			}
		}
		if(index==-1) {
			System.out.println("�����ڸ�ѧ������");
		}else {
			arr.remove(index);
		}
	}
	
	public static void modify(ArrayList<Student> arr) {
		Scanner sc=new Scanner(System.in);
		Student stu=new Student();
		System.out.println("��������Ҫ�޸ĵ�ѧ������");
		String str=sc.nextLine();
		System.out.println("��Ҫ�޸ĵ�ѧ������Ϊ"+str);		
				
		int index=-1;
		for(int i=0;i<arr.size();i++) {
			Student s=arr.get(i);
			if(s.getName().equals(str)) {
				index=i;
			}
		}
		if(index==-1) {
			System.out.println("�����ڸ�ѧ������");
		}else {
			System.out.println("������ѧ������:");
			String name=sc.nextLine();
			stu.setName(name);
			System.out.println("������ѧ������:");
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
