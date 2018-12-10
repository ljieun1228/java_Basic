package day7;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Calc cal = new Calc();
		Bmi aa = new Bmi();
		
		while(true){
						System.out.println("[메뉴]0.종료 1.오칙연산 2.BMI 3.윤년 4.성별 5.등수");
						String select = scanner.next();
		 	switch(select){
			 case "0" : 
					System.out.println("종료합니다.");
				return;
			case "1" : 
				cal.Calc();
				break;
			case "2" : 
				aa.Bmi();
				break;
			case "3" :
				break;
			case "4" : break;
			case "5" : break;
	       }
		}
	}
}
