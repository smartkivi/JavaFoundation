package kivi.excrise;
import java.util.*;
import java.io.*;
public class WriteArrayListFile {
	public static void main(String[] args)throws IOException {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("one");
		arr.add("two");
		arr.add("three");
		arr.add("four");
		arr.add("five");
		System.out.println(arr);
		BufferedWriter bw=new BufferedWriter(new FileWriter("arraylist.txt"));
		//String str;
		for(int i=0;i<arr.size();i++) {
			bw.write(arr.get(i));
			bw.newLine();
		}
		bw.close();
	}
}
