package pack1;

public class jumpstatements {

	public static void main(String[] args) {
		for (int i = 10;i>=0;i--)
		{
			if(i==5)
			{break;}
			System.out.println(i);
		}
		for (int c = 10;c>=0;c--)
		{
			if(c==5 || c==7 || c==9)
			{continue;}
			System.out.println(c);
		}

	}

}
