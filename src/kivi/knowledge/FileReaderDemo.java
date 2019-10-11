package kivi.knowledge;
import java.io.*;
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//FileReader fr=new FileReader("fw.txt");
		FileReader fr=new FileReader("fwd.java");
		char[] ch=new char[1024];
		int len;
		while((len=fr.read(ch))!=-1) {
			System.out.print(new String(ch,0,len));
		}
		
//		for(int i=0;ch!=-1;i++) {
//			//System.out.print(ch);
//			System.out.print((char)ch);
//			ch=fr.read();
//		}
		fr.close();
	}
}
