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
		
		System.out.println("Enter digit quantity you want");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Invalid data");
			System.out.println("Enter digit");
		}
		consoleListValue = sc.nextInt();
		
		System.out.println("Enter " + consoleListValue + " digits");
		
		for (int i = 0; i < consoleListValue; i++) {
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Invalid data");
				System.out.println("Enter digit");
			}
			consoleList.add(sc.nextInt());
		}
		
		System.out.print("You enter: " );
		for (int value : consoleList) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		consoleList.sort(null);
		System.out.println("Max digit: " + consoleList.get(consoleListValue-1));
		System.out.println("Min digit: " + consoleList.get(0));
		
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
		System.out.println("Max digit according to length: " + maxAbsDigit + " it's length " + maxAbsValue);
		System.out.println("Min digit according to length: " + minAbsDigit + " it's length " + minAbsValue);
	}
}

	