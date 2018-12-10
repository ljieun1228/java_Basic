package day9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true){
			System.out.println("메뉴\n"
					+ "0.정지\n"
					+ "1.BMI\n"
					+ "2.Calc\n"
					+ "3.ForDemo\n"
					+ "4.Gugudan\n"
					+ "5.LottoNumberGen\n"
					+ "6.NameArray\n"
					+ "7.OddSum\n"
					+ "8.ScoreArray");
			String select = scan.next();
			switch (select) {
			case "0":
	
				return;
			case "1":
				
				break;
			case "2":
				
				break;
			case "3":
				
				break;
			case "4":
				Gugudan gugudan = new Gugudan();
				gugudan.gugudan();
				break;
			case "5":
				
				break;
			case "6":
				
				break;
			case "7":
				
				break;
			case "8":
				
				break;

			default:
				break;
			}
			
		}
		
	}

}
