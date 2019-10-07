package kivi.excrise;
import java.util.*;
public class BuyChicken {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		for(int i=0;i<=20;i++) {
			for(int j=0;j<=34;j++) {
				for(int k=0;k<=300;k++) {
					if((i*5+3*j+k/3)==100 && (i+j+k)==100) {
						array.add("公鸡"+i+"只"+"母鸡"+j+"只"+"小鸡"+k+"只");
					}
				}
			}
		}
		System.out.println(array);
	}
}
