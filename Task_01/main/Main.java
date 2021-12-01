package Task_01.main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner (System.in);
		int temp;
		
		System.out.println("Enter 1 to 7 digit");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Invalid data");
			System.out.println("Enter 1 to 7 digit");
		}
		
		temp=sc.nextInt();
		
		switch (temp) {
		case (1):
			System.out.println(DayOfWeekEnum.MONDAY);
			break;
		case (2):
			System.out.println(DayOfWeekEnum.TUESDAY);
			break;
		case (3):
			System.out.println(DayOfWeekEnum.WEDNESDAY);
			break;
		case (4):
			System.out.println(DayOfWeekEnum.THURSDAY);
			break;
		case (5):
			System.out.println(DayOfWeekEnum.FRIDAY);
			break;
		case (6):
			System.out.println(DayOfWeekEnum.SATURDAY);
			break;
		case (7):
			System.out.println(DayOfWeekEnum.SUNDAY);
			break;
		default:
			System.out.println("Check entered data");
			break;
		}
		
	}
}
