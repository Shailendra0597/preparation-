
public class ReverseWord {

	public static void main(String[] args) {

		String str="shailendra singh Rajawat";
		
	    String[] stringArray=str.split(" ");
		
	    String rev="";
	    
	    for(int i=stringArray.length-1;i>=0;i--) {
	    	rev+=stringArray[i]+" ";
	    }
		
	    System.out.println(rev);
	}

}