
	import java.util.Scanner;
	public class Demointerfacetwo implements Interfaceone {
	public Demointerfacetwo()
	{
	}
	
	@Override
	public void methodone()
	{
		int number;
		int square;
		System.out.println("enter any number");
		Scanner sn = new Scanner(System.in);
		number=sn.nextInt();
		square=number*number;
		System.out.println("the number you entered is:"+number);
		System.out.println("the square of the number is:"+square);
		
	}
	}



