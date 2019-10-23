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
			Scanner sc_add=new Scanner(System.in);
			BufferedWriter bw=new BufferedWriter(new FileWriter("threeStudents.txt",true));
			System.out.println("the numbers of students£¿");
			int total=sc_add.nextInt();
			sc_add.nextLine();
			for(int i=0;i<total;i++) {
				Student stu=new Student();
				System.out.println("please input students'data:");
				
				boolean loop=true;
				while(loop) {
					//search the whole file again
					BufferedReader br=new BufferedReader(new FileReader("threeStudents.txt"));
					BufferedReader br1=new BufferedReader(new FileReader("threeStudents.txt"));
					//judge id
					boolean flag=true;
					System.out.print("id:");
					String id=sc_add.nextLine();
					String line;
					while((line=br.readLine())!=null) {
							String[] strarr=line.split(",");
							if(strarr[0].equals(id)) {
								flag=false;
								break;
							}
					}
					if(flag==false) {
						System.out.println("please input again(incorrect id)");
						continue;
					}
					stu.setId(id);
					
					//judge name
					boolean flag1=true;
					System.out.print("name:");
					String name=sc_add.nextLine();
					String line1;
					while((line1=br1.readLine())!=null) {
							String[] strarr1=line1.split(",");
							if(strarr1[1].equals(name)) {
								flag1=false;
								break;
							}
					}
					if(flag1==false) {
						System.out.println("please input again(incorrect name)");
						continue;
					}else {
						loop=false;
						stu.setName(name);
					}
					br.close();
					br1.close();
				}


				//input age and address;
				System.out.print("age:");
				stu.setAge(sc_add.nextInt());
				sc_add.nextLine();
				System.out.print("address:");
				stu.setAddress(sc_add.nextLine());
				StringBuilder sb=new StringBuilder();
				sb.append(stu.getId()).append(',').append(stu.getName()).append(',').append(stu.getAge()).append(',').append(stu.getAddress());
				bw.write(sb.toString());
				bw.newLine();
				bw.flush();
				//System.out.println(arr.size());
			}
			bw.close();
		}


		public static void delete(ArrayList<Student> arr)throws IOException {
			Scanner sc=new Scanner(System.in);
			System.out.println("please input the name of student£º");
			String name=sc.nextLine();
			
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
			br.close();
			int index=-1;
			for(int i=0;i<arr.size();i++) {
				Student s=arr.get(i);
				if(s.getName().equals(name)) {
					index=i;
					arr.remove(i);
				}
			}
			if(index==-1) {
				System.out.println("the student no exit");
			}else {
				BufferedWriter bw=new BufferedWriter(new FileWriter("threeStudents.txt"));
				for(int i=0;i<arr.size();i++) {
					//System.out.println(i);
					StringBuilder sb=new StringBuilder();
					sb.append(arr.get(i).getId()).append(',').append(arr.get(i).getName()).append(',').append(arr.get(i).getAge()).append(',').append(arr.get(i).getAddress());
					bw.write(sb.toString());
					bw.newLine();
				}
				bw.close();
			}
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
		}
		
		public static void exit() {
			System.out.println("Thank you for using!");
			System.exit(0);
		}
		
}

