package interview_problums;

public class sum_or_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int [] arr = {1,5,4,6,8,910,15};
 int sum =0;
 for (int i =0; i<arr.length;i++) {
	 sum+= arr[i];
 }
  int avg = sum/arr.length;
  System.out.println("avegerae" + avg);
 
 System.out.println("sum of "+sum);
 
 int total =0, avarage =0;
 
 for(int k : arr) {
	 total = total+ k;
 }
 System.out.println( "total of "+total);
  System.out.println("avarage of arr is " + total/arr.length);
 
	}

}
