package interview_problums;

import java.util.HashSet;
import java.util.Set;

public class dupicite_arr {
	public static void main(String[] args) {
		int [] arr =  {1,5,4,2,4,1,4,2,4,1};
		for (int i =0; i<arr.length-1 ;i++) {
			for (int j =i+1; j<arr.length; j++) {
				if(arr[i]== arr[j]) {
					System.out.println("duplicate " + arr[i]);
				}
			}
		}
		
		//second way
		 Set<Integer> duplicate = new HashSet<Integer>();
		 for (int i =0 ; i<arr.length;i++) {
			 if(!duplicate.add(arr[i])) {
				 System.out.println("dup values"+ arr[i]);
			 }
		 }
		
		
	}

}
