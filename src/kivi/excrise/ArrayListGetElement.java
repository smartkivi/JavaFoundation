package kivi.excrise;

import java.util.ArrayList;

public class ArrayListGetElement {
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		String[] str= {"������","��Զ��","���޼�","����ͤ","�Ŵ�ɽ","Ī����"};
		for(int i=0;i<str.length;i++) {
			arr.add(str[i]);
		}
		for(int i=0;i<str.length;i++) {
			boolean flag=false;
			for(int j=0;j<arr.get(i).length();j++) {
				if(arr.get(i).charAt(j)=='��') {
					flag=true;
					break;
				}
			}
			if(flag) {
				System.out.println(arr.get(i));
			}
		}
	}
}
