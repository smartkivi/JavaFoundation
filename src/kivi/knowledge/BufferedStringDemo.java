package kivi.knowledge;

import java.io.*;

public class BufferedStringDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw =new FileWriter("bw.txt");
		BufferedWriter bw=new BufferedWriter(fw);
//		bw.write("hello");
		for(int i=0;i<5;i++) {
			bw.write("hello"+i);
			bw.newLine();
		}
		bw.close();
		
		FileReader fr=new FileReader("bw.txt");
		BufferedReader br=new BufferedReader(fr);
//		int len;
//		char[] ch=new char[1024];
//		while((len=br.read(ch))!=-1) {
//			System.out.print(new String(ch,0,len));
//		}
		
//		int ch;
//		while((ch=br.read())!=-1){
//			System.out.print((char)ch);
//		}
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}
