package guessingnumber;

import java.util.Scanner;

public class GuessingNumber<K extends Comparable<K>> {

	private K[] list;
	Scanner scan = new Scanner(System.in);

	public void setRange(K range) {
		list = (K[]) new Integer[(int) range];
	}

	public void add(K key) {
		list[(int) key] = key;
	}

	public void playGame() {
		System.out.println("Assume the number within the range :");
		int max = 1000;
		int min = 0;
		int number = (max + min) / 2;
		showNumber(max, min, number);
	}

	private void showNumber(int max, int min, int number) {
		System.out.println(number);
		System.out.println("Enter your respone 1 for matched// 0 for getting lower number// 2 for getting high number: ");
		int response = scan.nextInt();
		if (response == 1) {
			System.out.println("Number matched");
			return;
		}
		if (response == 0) {
			showNumber(max, number, (max + number) / 2);
		}
		if (response == 2) {
			showNumber(number, min, (number + min) / 2);
		}
	}
}