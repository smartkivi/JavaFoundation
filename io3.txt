package kivi.knowledge;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("fw.txt",true);
//		fw.write("abcde");
//		fw.write("abcdefghijklmn",3,7);
//		fw.write('a');
//		fw.write(98);
//		char[] ch= {'a','b','c','d','e'};
//		fw.write(ch,2,2);
		for(int i=0;i<10;i++) {
			fw.write("hello"+i+"\n");
		}
		fw.flush();
		fw.close();
	}

}
