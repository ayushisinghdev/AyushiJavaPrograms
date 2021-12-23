package assignments;
import java.util.*;

public class fourthAssignment {

	public static void main(String[] args) {
		//count number of digits in a number
		System.out.println("Please enter number");
		Scanner sc= new Scanner(System.in);
		int b = sc.nextInt();
		int a = b;
		int count = 0;
		while(a != 0)
		{
			a = (a/10);
			++count;
		}
		System.out.println("Number of digits in "+b+" is "+count);
		
       
	}

}
