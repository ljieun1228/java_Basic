package day2;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("~계산기~");
		int num1 = scanner.nextInt();
		String op = scanner.next();
		int num2 = scanner.nextInt();
		int res = 0;
		switch (op) {
		case "+":
			res=num1 + num2;
			break;
		case "-":
			res=num1 + num2;
			break;
		case "/":
			res=num1 + num2;
			break;
		case "*":
			res=num1 + num2;
			break;
		case "%":
			res=num1 + num2;
			break;
		default:
			break;
		}
		System.out.println(num1+op+num2+"="+res);
	}
}


