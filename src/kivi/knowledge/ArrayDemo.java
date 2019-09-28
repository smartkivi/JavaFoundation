package kivi.knowledge;

public class ArrayDemo {
	public static void main(String[] args) {
//		int[] arr= {1,2,3};
//		int[] arr=new int[3];
//		System.out.println(arr);
		
//		int[][] arr=new int[2][3];
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int x=0;x<arr.length;x++) {
			for(int y=0;y<arr[x].length;y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
	}
}
