import java.util.*;
public class pascal{

 
	public static int combination(int n, int k){

		if(k == 0 || n == 0 || k == n)
		{
			return 1; 
		}
		else 
			return combination(n-1, k) + combination(n-1, k-1);
	}
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println ("Please Enter the value of n");
		int n = scan.nextInt(); 

		Scanner input = new Scanner(System.in);
		System.out.println ("Please Enter the value of k");
		int k = input.nextInt(); 

		System.out.println ("The Binomial coeffiecent is " + combination(n, k));

	}
}