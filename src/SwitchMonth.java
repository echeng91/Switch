import java.util.Scanner;
public class SwitchMonth {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of days in the month: ");
		int daysInMonth = sc.nextInt();
		sc.close();
		switch(daysInMonth)
		{
			case 28: System.out.println("Twenty-eight days has February.");
					break;
			case 29: System.out.println("Twenty-nine days has February.");
					break;
			case 30: System.out.println("Thirty days has April, June, September, and November.");
					break;
			case 31: System.out.println("Thirty-one days has January, March, May, July, August, October, and December.");
					break;
			default: System.out.printf("There are no months with exactly %d days.%n", daysInMonth);
					break;
		}
	}
}
