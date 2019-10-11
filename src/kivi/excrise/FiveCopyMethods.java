package kivi.excrise;
import java.io.*;
public class FiveCopyMethods {
	public static void main(String[] args) throws IOException{
		String srcFile="fwd.java";
		method1(srcFile,"io1.txt");
		method2(srcFile,"io2.txt");
		method3(srcFile,"io3.txt");
		method4(srcFile,"io4.txt");
		method5(srcFile,"io5.txt");
	}
	
	public static void method1(String srcFile,String desFile) throws IOException {
		FileReader fr=new FileReader(srcFile);
		FileWriter fw=new FileWriter(desFile);
		int ch;
		while((ch=fr.read())!=-1) {
			fw.write((char)ch);
		}
		fr.close();
		fw.close();
	}
	
	public static void method2(String srcFile,String desFile) throws IOException{
		FileReader fr=new FileReader(srcFile);
		FileWriter fw=new FileWriter(desFile);
		int len;
		char[] ch=new char[1024];
		while((len=fr.read(ch))!=-1) {
			fw.write(ch,0,len);
		}
		fr.close();
		fw.close();
	}
	
	public static void method3(String srcFile,String desFile) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(srcFile));
		BufferedWriter bw=new BufferedWriter(new FileWriter(desFile));
		int ch;
		while((ch=br.read())!=-1) {
			bw.write((char)ch);
		}
		br.close();
		bw.close();
	}
	
	public static void method4(String srcFile,String desFile) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(srcFile));
		BufferedWriter bw=new BufferedWriter(new FileWriter(desFile));
		int len;
		char[] ch=new char[1024];
		while((len=br.read(ch))!=-1) {
			bw.write(ch,0,len);
		}
		br.close();
		bw.close();
	}
	
	public static void method5(String srcFile,String desFile) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(srcFile));
		BufferedWriter bw=new BufferedWriter(new FileWriter(desFile));
	    String str;
	    while((str=br.readLine())!=null) {
	    	bw.write(str);
	    	bw.newLine();
	    }
		br.close();
		bw.close();
	}
}
