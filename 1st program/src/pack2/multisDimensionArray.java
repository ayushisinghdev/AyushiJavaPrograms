package pack2;

public class multisDimensionArray {

	public static void main(String[] args) {
		int a[][] = new int[3][2];
		a[0][0]=1;
		a[0][1]=21;
		a[1][0]=31;
		a[1][1]=11;
		a[2][0]=12;
		a[2][1]=13; 
		
		//without stating no of values
		
		int b[][]={{11,22},{33,44},{55,66}};
		
		//find no. of rows
		
		System.out.println(a.length);
		
		//find no.of columns
		
		System.out.println(a[0].length);
		
		//read arrays
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}

	}

}
