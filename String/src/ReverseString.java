
public class ReverseString {

	public static void main(String[] args) {
		
		String s="abc    xyz";
		
		String rev="";
		
		
		// Time complexity O(n)
		// space complexity O(n)
		
//		for(int i=s.length()-1;i>=0;i--) {
//			rev=rev+s.charAt(i);
//		}
//		
//		System.out.println(rev);
		
		
		System.out.println("****************");
		
		System.out.println("using character array");
		
		char[] arr=s.toCharArray();
		int len=arr.length;
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+arr[i];
			
		}
		
		System.out.println(rev);
		
		// using string buffer
		
//		StringBuffer sb=new StringBuffer(s);
//		System.out.println(sb.reverse());
		
	}
}
