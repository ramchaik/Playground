import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      System.out.println( fact(n) );
    }
  	public static int fact(int n){
    	int ans = 1;
      	for(int i = 1; i <= n; i++ )
          ans *= i;
      	return ans;
    }
 
}