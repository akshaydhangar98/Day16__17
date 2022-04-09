package balancedparantheses;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the expression:");
		String input = scan.nextLine();
		BalancedParantheses<String> balancedParantheses = new BalancedParantheses<String>(input);
		System.out.println(balancedParantheses.checkParanthesis());
	}
}
