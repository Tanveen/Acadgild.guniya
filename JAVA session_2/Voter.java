import java.util.Scanner;

public class Voter {
	public static void main(String[] args)
	{
		int age;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your age");
		age= ip.nextInt();
		if(age<18)
		{
			System.out.println("You are not eligible to vote");
		}
		else{
				System.out.println("You are eligible to vote");
		}
	}

}