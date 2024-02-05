package interview_problums;

public class fibnasinuber {
public static void main(String[] args) {
	fib(50);
	
	
}


public static void fib (int count) {
	int a=0, b=1,c=1;
	
	for(int i =0; i <count ; i++) {
		System.out.println(a );
		a= b;
		b=c;
		c=a+b;
		
	}
	
}
}
