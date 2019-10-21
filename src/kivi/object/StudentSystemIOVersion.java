package kivi.object;
import java.util.*;
import java.io.*;
public class StudentSystemIOVersion {
	public static void main(String[] args)throws IOException{
		ArrayList<Student> arr=new ArrayList<Student>();
		while(true) {
			System.out.println("-----------Welcome to the Student Manager System---------");
			System.out.println("1 Browse");
			System.out.println("2 Add");
			System.out.println("3 Delete");
			System.out.println("4 Modify");
			System.out.println("5 Exit");
			Scanner sc=new Scanner(System.in);
			System.out.print("please input your choice£º");
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
			sc.close();
		}
	}
		public static void browse(ArrayList<Student> arr) throws IOException{
			BufferedReader br=new BufferedReader(new FileReader("threeStudents.txt"));
			String line;
			while((line=br.readLine())!=null) {
				Student stu=new Student();
				String[] str=line.split(",");
				stu.setId(str[0]);
				stu.setName(str[1]);
				stu.setAge(Integer.valueOf(str[2]));
				stu.setAddress(str[3]);
				arr.add(stu);
			}
			if(arr.size()==0) {
				System.out.println("no data");
				br.close();
				return;
			}
			System.out.println("id\tname\tage\taddress\t");
			for(int i=0;i<arr.size();i++) {
				System.out.println(arr.get(i).getId()+"\t"+arr.get(i).getName()+"\t"+arr.get(i).getAge()+"\t"+arr.get(i).getAddress());
			}
			br.close();
		}
		
		public static void add(ArrayList<Student> arr) throws IOException{
			Scanner sc=new Scanner(System.in);
			BufferedReader br=new BufferedReader(new FileReader("threeStudents.txt"));
			BufferedReader br1=new BufferedReader(new FileReader("threeStudents.txt"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("threeStudents.txt",true));
			System.out.println("the numbers of students£¿");
			int total=sc.nextInt();
			sc.nextLine();
			for(int i=0;i<total;i++) {
				Student stu=new Student();
				System.out.println("please input students'data:");
				
				//judge id
				boolean loop=true;
				while(loop) {
					boolean flag=true;
					System.out.print("id:");
					String id=sc.nextLine();
					String line;
					while((line=br.readLine())!=null) {
							String[] strarr=line.split(",");
							if(strarr[0].equals(id)) {
								flag=false;
								break;
							}
					}
					if(flag==true) {
						stu.setId(id);
						//judge name
						boolean flag1=true;
						while(true) {
							System.out.print("name:");
							String name=sc.nextLine();
							String line1;
							while((line1=br1.readLine())!=null) {
									String[] strarr1=line1.split(",");
									if(strarr1[1].equals(name)) {
										flag1=false;
										//System.out.println(strarr1.);
										break;
									}
							}
							if(flag1==true) {
								stu.setName(name);
								loop=false;
								break;
							}else {
								System.out.println("please input again(name)");
							}
						}
					}else {
						System.out.println("please input again(id)");
					}
				}

				//input age and address;
				System.out.print("age:");
				stu.setAge(sc.nextInt());
				sc.nextLine();
				System.out.print("address:");
				stu.setAddress(sc.nextLine());
				StringBuilder sb=new StringBuilder();
				sb.append(stu.getId()).append(',').append(stu.getName()).append(',').append(stu.getAge()).append(',').append(stu.getAddress());
				bw.write(sb.toString());
				bw.flush();
				//System.out.println(arr.size());
			}
			br.close();
			br1.close();
			bw.close();
			sc.close();
		}


		public static void delete(ArrayList<Student> arr)throws IOException {
			Scanner sc=new Scanner(System.in);
			System.out.println("please input the name of student£º");
			String str=sc.nextLine();
			int index=-1;
			for(int i=0;i<arr.size();i++) {
				Student s=arr.get(i);
				if(s.getName().equals(str)) {
					index=i;
				}
			}
			if(index==-1) {
				System.out.println("the student no exit");
			}else {
				arr.remove(index);
			}
			sc.close();
		}
		
		public static void modify(ArrayList<Student> arr) throws IOException{
			Scanner sc=new Scanner(System.in);
			Student stu=new Student();
			System.out.println("please input the student of name");
			String str=sc.nextLine();
			System.out.println("name:"+str);		
					
			int index=-1;
			for(int i=0;i<arr.size();i++) {
				Student s=arr.get(i);
				if(s.getName().equals(str)) {
					index=i;
				}
			}
			if(index==-1) {
				System.out.println("the student no exit");
			}else {
				System.out.println("please input student's name:");
				String name=sc.nextLine();
				stu.setName(name);
				System.out.println("please input student's age:");
				int age=sc.nextInt();
				stu.setAge(age);
				arr.set(index,stu);
			}
			sc.close();
		}
		
		public static void exit() {
			System.out.println("Thank you for using!");
			System.exit(0);
		}
		
}

