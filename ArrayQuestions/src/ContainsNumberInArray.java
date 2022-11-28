
public class ContainsNumberInArray {

	public static void main(String[] args) {

      int[] arr = {2,4,5,7,1};
      boolean check=false;
      int checkNumber=10;
      
      for(int i=0;i<arr.length;i++) {
    	  if(arr[i]==checkNumber) {
    		  System.out.println(arr[i]);
    		  check=true;
    	  }
      }
    
      if(check==false) {
    	  System.out.println("not found");
      }
      

	}

}
