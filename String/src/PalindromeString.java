
public class PalindromeString {

	public static void main(String[] args) {

		String s="abbaa";
		
		char[] stringArray=s.toCharArray();
		
		String revWord="";
		
		for(int i=stringArray.length-1;i>=0;i--) {
			revWord+=stringArray[i];
		}
		
		if(revWord.equals(s)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
	}

}
