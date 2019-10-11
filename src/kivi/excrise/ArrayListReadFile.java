package kivi.excrise;
import java.util.*;
import java.io.*;
public class ArrayListReadFile {
	public static void main(String[] args)throws IOException {
		ArrayList<String> arr=new ArrayList<String>();
		BufferedReader br=new BufferedReader(new FileReader("arraylist.txt"));
		String str;
		while((str=br.readLine())!=null) {
			arr.add(str);
		}
		System.out.println(arr);
		br.close();
	}
}
