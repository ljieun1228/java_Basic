package day3;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		System.out.println("~체질량지수~\n"
				+ "키, 몸무게를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		double H = scan.nextDouble();
		double W = scan.nextDouble();
		double BMI = W/((H/100)*(H/100));

		if(BMI>=40){
			System.out.println("고도비만");
		}else if(BMI<40&&BMI>=35){
			System.out.println("중등도비만");
		}else if(BMI<30&&BMI>25){
			System.out.println("과체중");
		}else if(BMI<25&&BMI>=18.5){
			System.out.println("정상");
		}else {
			System.out.println("저체중");
		}
	}
}
