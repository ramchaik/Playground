import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++)
      	arr[i] = sc.nextInt();
    int val = -1;
    for (int i = 0; i < n; i++) {
    	val = -1;
   		for (int j = i; j < n; j++) {
        	if (arr[i] < arr[j] && arr[j] > val) {
            	System.out. println(arr[i] + "," + arr[j]);
              	val = arr[j];
            }
        }
    }
    
  }
}