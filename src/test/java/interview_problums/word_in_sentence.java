package interview_problums;

public class word_in_sentence {
	public static void main(String[] args) {
		String name = "this is sateesh i am from the";
		 String []arr= name.split(" ");
		 System.out.println(arr.length);
		 
		 for (int i =0 ; i <arr.length; i++) {
			 System.out.println(arr[i]);
		 }
		 
		 String reverse = "";
		 
		 for (int i = arr.length-1 ; i>=0; i--) {
			 reverse = reverse+ arr[i];
		 }
		 System.out.println(reverse);
		
		
	}

}
