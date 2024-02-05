package interview_problums;

public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "my name is sateesh";
		char[] stringarry =name.toCharArray();
		String outer1 = "";
		for(int i = stringarry.length-1; i>=0; i--) {
			outer1 += stringarry[i];
		}
		System.out.println(outer1);
		
		String name1 = "ravan";
		char []arr=name1.toCharArray();
		String revers = "";
		for(int i = arr.length-1; i>=0;i--) {
			revers= revers+ arr[i];
		}
		
		System.out.println(revers.toUpperCase());
		
		
		
	}

}
