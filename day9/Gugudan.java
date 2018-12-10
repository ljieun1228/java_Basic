package day9;

import java.util.Scanner;

public class Gugudan {
	public void gugudan(){
		System.out.println("구구단 몇단?");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String res = "";
		for (int i = 1; i < 10; i++) {
			res+=num+"*"+i+"="+(num*i)+"\n";
		}
		System.out.println(res);
	}
}

