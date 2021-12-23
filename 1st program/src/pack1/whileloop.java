package pack1;

public class whileloop {

	public static void main(String[] args) {
		System.out.println("all numbers");
		int i = 1;
		while (i<=10)
		{
			System.out.println(i);
			i++;
		}
//single line comment
		/*multi
		 * line
		 * comment
		 */
		System.out.println("even numbers");
		int e = 2;
		while (e<=10)
		{
			System.out.println(e);
			e+=2;
		}
		System.out.println("odd numbers");
		int o = 1;
		while (o<=10)
		{
			System.out.println(o);
			o+=2;
		}
		System.out.println("decending order");
		int d = 10;
		while (d>=0)
		{
			System.out.println(d);
			d--;
		}
		
	}

}
