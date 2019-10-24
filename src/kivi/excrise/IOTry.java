package kivi.excrise;
import java.util.*;
import java.io.*;
public class IOTry {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("threestudents.txt")); 
		String line;
		while((line=br.readLine())!=null) {
			String[] str=line.split(",");
			System.out.print(str.length+":");
//			System.out.println(str[1]);
			System.out.print(str[2]);
			System.out.println();
		}
	}
}
