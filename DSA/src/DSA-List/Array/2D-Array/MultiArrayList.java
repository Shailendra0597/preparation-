package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		
		//Initialized 3 new array list
		for(int i=0;i<3;i++) {
			list.add(new ArrayList<>());
		}
		
		//add element into that arrayList
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				list.get(i).add(sc.nextInt());
			}
		}
		
	   System.out.println(list);
	}

}
