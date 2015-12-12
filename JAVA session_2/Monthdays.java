import java.util.Scanner;

public class Monthdays {
	public static void main(String[] args)
	{
		int month;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the month number from 1-12");
		month = s.nextInt();
		switch(month)
		{
		case 2:
		{
			System.out.println("Total number of days are 28 or 29 in leap year");break;
		}
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		{
			System.out.println("Total number of days are 31");break;
		}
		case 4:
		case 6:
		case 9:
		case 11:
			{
				System.out.println("Total number of days are 30");break;
			}
		default:
		{
			System.out.println("Enter the correct number");
		}
		}
		
	}

}
