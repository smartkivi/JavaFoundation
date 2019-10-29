package kivi.knowledge;

public class MyArrays {
	private MyArrays() {
		
	}
	public static int getMax(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int getIndex(int[] arr,int num) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==index) {
				break;
			}
		}
		return index;
	}
}
