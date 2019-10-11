package kivi.excrise;
import java.io.*;
public class CopyFile {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("fwd.java");
		FileWriter fw=new FileWriter("fwd.txt");
//		int ch;
//		while((ch=fr.read())!=-1) {
//			fw.write((char)ch);
//		}
		int len;
		char[] ch=new char[1024];
		while((len=fr.read(ch))!=-1) {
			fw.write(new String(ch),0,len);
		}
		fr.close();
		fw.close();
		FileReader fr1=new FileReader("fwd.txt");
		int ch1;
		while((ch1=fr1.read())!=-1) {
			System.out.print((char)ch1);
		}
		fr1.close();
	}
}
