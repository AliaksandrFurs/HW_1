package Task_01.main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner (System.in);
		int temp;
		
		System.out.println("������� ����� �� 1 �� 7");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("�������� ������");
			System.out.println("������� ����� �� 1 �� 7");
		}
		
		temp=sc.nextInt();
		
		switch (temp) {
		case (1):
			System.out.println(DayOfWeekEnum.�����������);
			break;
		case (2):
			System.out.println(DayOfWeekEnum.�������);
			break;
		case (3):
			System.out.println(DayOfWeekEnum.�����);
			break;
		case (4):
			System.out.println(DayOfWeekEnum.�������);
			break;
		case (5):
			System.out.println(DayOfWeekEnum.�������);
			break;
		case (6):
			System.out.println(DayOfWeekEnum.�������);
			break;
		case (7):
			System.out.println(DayOfWeekEnum.�����������);
			break;
		default:
			System.out.println("��������� ������������ ����� �����");
			break;
		}
		
	}
}
