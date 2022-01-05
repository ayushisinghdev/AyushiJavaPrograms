package pack2;

public class arrays {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		System.out.println(a.length);
		System.out.println(a[4]);
		
		for(int i=0;i<a.length;i++)
			//i<=4
		{
			System.out.println(a[i]);
		}
		/* Advanced/Enhanced for loop
		for each loop*/
		for(int r:a)
		{
			System.out.println(r);
		}
		
		int b[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(b[3]);
		System.out.println(b.length);
		
		for(int p:b)
		{
			System.out.println(p);
		}
        
		/*multi dimension 
		 * int a[][] = new int [5][9] [row][column];*/

}}