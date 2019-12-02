package main;

public class Blackjack {

	public static void main(String[] args) {

		numberCheck(22, 10);
	}

	public static void numberCheck(int num1, int num2) {

		num1 = (num1 > 21) ? 0 : num1;
		num2 = (num2 > 21) ? 0 : num2;

		int rtn = (num1 > num2) ? num1 : num2;
		System.out.println(rtn);
	}
}