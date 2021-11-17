package Task_02;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		List <Integer> consoleList = new ArrayList();
		int consoleListValue;
		
		System.out.println("Введите желаемое количество чисел");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Неверные данные");
			System.out.println("Введите число");
		}
		consoleListValue = sc.nextInt();
		
		System.out.println("Введите " + consoleListValue + " чисел");
		
		for (int i = 0; i < consoleListValue; i++) {
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Неверные данные");
				System.out.println("Введите число");
			}
			consoleList.add(sc.nextInt());
		}
		
		System.out.print("Вы ввели: " );
		for (int value : consoleList) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		consoleList.sort(null);
		System.out.println("Максимальное число: " + consoleList.get(consoleListValue-1));
		System.out.println("Минимальное число: " + consoleList.get(0));
		
		int minAbsValue = String.valueOf(Math.abs(consoleList.get(0))).length();
		int maxAbsValue = String.valueOf(Math.abs(consoleList.get(0))).length();
		int maxAbsDigit = consoleList.get(0);
		int minAbsDigit = consoleList.get(0);
		
		for (int value : consoleList) {
			int temp = String.valueOf(Math.abs(value)).length();
			if(temp > maxAbsValue) {
				maxAbsValue = temp;
				maxAbsDigit = value;
			}
			if (temp < minAbsValue) {
				minAbsValue = temp;
				minAbsDigit = value;
			}
		}
		System.out.println("Максимальное число по длине: " + maxAbsDigit + " его длина " + maxAbsValue);
		System.out.println("Минимальное число по длине: " + minAbsDigit + " его длина " + minAbsValue);
	}
}

	