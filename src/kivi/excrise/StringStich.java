package kivi.excrise;

public class StringStich {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		System.out.println(arrayToString(arr));
	}
	
	public static String arrayToString(int[] arr) {
//		String s=new String();
//		s=s+"[";
//		for(int i=0;i<arr.length;i++) {
//			s=s+arr[i];
//			if(i!=(arr.length-1)) {
//				s=s+",";
//			}
//		}
//		s=s+"]";
//		return s;
		StringBuilder sb=new StringBuilder();
		sb.append('[');
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]);
			if(i!=(arr.length-1)) {
				sb.append(',');
			}
		}
		sb.append(']');
		return sb.toString();
	}
}
