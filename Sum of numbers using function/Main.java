import java.util.Scanner;
class Main{
  	public static int sum_natural(int n) {
    	int sum = 0;	
      	for (int i = 1; i <= n; i++)
        	sum += i;
    	return sum;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(sum_natural(n));
	}
}