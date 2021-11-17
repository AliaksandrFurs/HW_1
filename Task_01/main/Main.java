package Task_01.main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner (System.in);
		int temp;
		
		System.out.println("Введите число от 1 до 7");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Неверные данные");
			System.out.println("Введите число от 1 до 7");
		}
		
		temp=sc.nextInt();
		
		switch (temp) {
		case (1):
			System.out.println(DayOfWeekEnum.ПОНЕДЕЛЬНИК);
			break;
		case (2):
			System.out.println(DayOfWeekEnum.ВТОРНИК);
			break;
		case (3):
			System.out.println(DayOfWeekEnum.СРЕДА);
			break;
		case (4):
			System.out.println(DayOfWeekEnum.ЧЕТВЕРГ);
			break;
		case (5):
			System.out.println(DayOfWeekEnum.ПЯТНИЦА);
			break;
		case (6):
			System.out.println(DayOfWeekEnum.СУББОТА);
			break;
		case (7):
			System.out.println(DayOfWeekEnum.ВОСКРЕСЕНЬЕ);
			break;
		default:
			System.out.println("Проверьте правильность ввода чисел");
			break;
		}
		
	}
}
