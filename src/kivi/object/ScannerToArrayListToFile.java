package kivi.object;
import java.util.*;
import java.io.*;
public class ScannerToArrayListToFile {

	public static void main(String[] args) throws IOException{
		ArrayList<Student> arr=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		//input data from Scanner
		for(int i=0;i<3;i++) {
			System.out.println("please input data(id,name,age,address)");
			String id=sc.nextLine();
			String name=sc.nextLine();
			int age=sc.nextInt();
			sc.nextLine();
			String address=sc.nextLine();
			Student stu=new Student(id,name,age,address);
			arr.add(stu);
		}
		//traverse and write data to file
		BufferedWriter bw=new BufferedWriter(new FileWriter("threeStudents.txt"));
		for(int i=0;i<arr.size();i++) {
			Student stu=arr.get(i);
			bw.write(stu.getId()+","+stu.getName()+","+stu.getAge()+","+stu.getAddress());
			bw.newLine();
			bw.flush();
		}
		bw.close();
		
		ArrayList<Student> arr1=new ArrayList<Student>();
		BufferedReader br=new BufferedReader(new FileReader("threeStudents.txt"));
		String line;
		while((line=br.readLine())!=null) {
//			String[] str=new String[4];
//			int j=0;
//			int start=0;
////			System.out.println("line:"+line);
//			for(int i=0;i<line.length();i++) {
//				if(line.charAt(i)==',') {
//					str[j]=line.substring(start,i);
////					System.out.println("substring:"+str[j]);
//					j++;
//					start=i+1;
//				}
//				if(i==line.length()-1) {
//					str[j]=line.substring(start,i+1);
////					System.out.println("substring:"+str[j]);
//					j++;
//				}
//			}
			Student stu=new Student();
			String[] str=line.split(",");
			stu.setId(str[0]);
			stu.setName(str[1]);
			stu.setAge(Integer.valueOf(str[2]));
			stu.setAddress(str[3]);
			arr1.add(stu);
		}
		br.close();
		System.out.println("id\tname\tage\taddress\t");
		for(int i=0;i<arr1.size();i++) {
			System.out.println(arr1.get(i).getId()+"\t"+arr1.get(i).getName()+"\t"+arr1.get(i).getAge()+"\t"+arr1.get(i).getAddress());
		}
		sc.close();
	}

}
