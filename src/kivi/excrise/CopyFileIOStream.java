package kivi.excrise;
import java.io.*;
public class CopyFileIOStream {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("fwd.java"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("io.txt"));
//		int ch;
//		while((ch=br.read())!=-1) {
//			bw.write((char)ch);
//		}
		
//		int len;
//		char[] ch=new char[1024];
//		while((len=br.read(ch))!=-1) {
//			bw.write(new String(ch,0,len));
//		}
		
		String str;
		while((str=br.readLine())!=null) {
			bw.write(str);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
}
