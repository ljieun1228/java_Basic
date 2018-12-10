package day7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Calc cal = new Calc();
		while(true){
			System.out.println("[메뉴]0.종료 1.오칙연산 ");
			String select = scanner.next();
			switch(select){
			case "0" : 
				System.out.println("종료합니다.");
				return;
			case "1" : 
				cal.Calc();
				break;	
			default :
				break;
			}
		}
	}
}
