package day7;

import java.util.Scanner;

public class Bmi {
 public void Bmi(){
	 System.out.println("BMI지수 계산\n 키와 몸무게를 입력하세요");
	 Scanner scan = new Scanner(System.in);
	 double H= scan.nextDouble();
	 double W= scan.nextDouble();
	 double bmi = W/((H/100)*(H/100));
				if(bmi>=40) {
					System.out.println("고도비만입니다.");
				}else if(35<= bmi && bmi<= 39.9) {
					System.out.println("중증도비만입니다.");
				}else if(30<= bmi && bmi<= 34.9) {
					System.out.println("경도비만입니다.");
				}else if (25<= bmi && bmi<= 29.9) {
				 System.out.println("과체중비만입니다.");
				}else if (18.5<= bmi && bmi<=24.9) {
					 System.out.println("정상입니다.");
				}else {
					 System.out.println("저체중입니다.");
		}
 	}
}
