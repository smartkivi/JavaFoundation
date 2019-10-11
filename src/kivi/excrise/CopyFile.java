package kivi.excrise;
import java.io.*;
public class CopyFile {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("fwd.java");
		FileWriter fw=new FileWriter("fwd.txt");
		int ch;
		while((ch=fr.read())!=-1) {
			fw.write((char)ch);
		}
		fr.close();
		fw.close();
		FileReader fr1=new FileReader("fwd.txt");
		while((ch=fr1.read())!=-1) {
			System.out.print((char)ch);
		}
		fr1.close();
	}
}
