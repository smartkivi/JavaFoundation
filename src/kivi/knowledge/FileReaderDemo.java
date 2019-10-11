package kivi.knowledge;
import java.io.*;
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//FileReader fr=new FileReader("fw.txt");
		FileReader fr=new FileReader("FileWriterDemo.java");
		int ch=fr.read();
		for(int i=0;ch!=-1;i++) {
			//System.out.print(ch);
			System.out.print((char)ch);
			ch=fr.read();
		}
		fr.close();
	}
}
