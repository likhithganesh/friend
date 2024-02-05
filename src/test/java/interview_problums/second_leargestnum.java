package interview_problums;

import java.util.Iterator;

public class second_leargestnum {
public static void main(String[] args) {
	int [] arr = {15,4,3,57,1,152 };
	
	int frist =arr[0], second = arr[0];
	for(int i =0 ; i<arr.length; i++) {
		if( arr[i] > frist) {
			second = frist;
			frist = arr[i];
			
		}else if (arr[i] > second) {
			second = arr[i];
		}
	}
	System.out.println("second learge elmnt "+ second );
	System.out.println("frist  learge elmnt "+ frist );
	
	int ffrist =arr[0], fsecond = arr[0];
	for(int i =0 ; i<arr.length; i++) {
		if( arr[i] < ffrist) {
			fsecond = ffrist;
			ffrist = arr[i];
			
		}else if (arr[i] > fsecond) {
			fsecond = arr[i];
		}
	}
	System.out.println("secon small " + fsecond);
	System.out.println("secon small " + ffrist);
	
	
}
}
