package ExceptionConcept.HandlingMethod;

import java.util.Scanner;

public class MainException {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter age : ");
		int n=sc.nextInt();
		
		try {
			if(n<18) {
				throw new YoungGen("not eligible");
			}else {
				System.out.println("eligible");
			}
		}catch (YoungGen e) {
			e.printStackTrace();
		}
	}

}
