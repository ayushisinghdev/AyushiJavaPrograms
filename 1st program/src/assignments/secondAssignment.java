package assignments;
import java.util.*;

public class secondAssignment {

	public static void main(String[] args) {
		//find greatest of 3 numbers
		System.out.println("Please enter 1st number");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Please enter 2nd number");
		int b = sc.nextInt();
		System.out.println("Please enter 3rd number");
		int c = sc.nextInt();
		int g;
		if(a>b)
			g = a;
		else
			g = b;
		if(g<c)
			System.out.println(c + " is the greatest number");
		else
			System.out.println(g + " is the greatest number");
			}

}
