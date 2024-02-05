package interview_problums;

public class swip_twonumbers {
	public static void main(String[] args) {
		int a = 10;
		int b =20;
		System.out.println("a value " + a );
		System.out.println("b value " + b );
		
		a = a+b;
		b = a-b;
		a= a-b	;
		System.out.println("after a value " + a );
		System.out.println("afterb value " + b );
	}

}
