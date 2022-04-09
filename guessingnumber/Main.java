package guessingnumber;

import java.util.Scanner;

public class Main<K> {

	public static void main(String[] args) {
		GuessingNumber<Integer> game = new GuessingNumber<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of number you want me to guess :");
		int range = scan.nextInt();
		game.setRange(range);
		for(int i=0; i < range; i++) {
			game.add(i);
		}
		game.playGame();
	}
}