package assignments;
import java.util.*;

public class thirdAssignment {

	public static void main(String[] args) {
		//multiplication table of x
		System.out.println("Please enter number");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1;i<=10;i++)
		{
			int b = (a*i);
			System.out.println(a +" * " +i +" = "+ b);
		}

	}

}
