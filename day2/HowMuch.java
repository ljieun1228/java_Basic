package day2;

import java.util.Scanner;

public class HowMuch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("얼마에요?");
		double a = scan.nextDouble();
		System.out.println("몇개 드려요?");
		double b = scan.nextDouble();
		double res = a*b;
		double res2 = 0;
		if(res>=1000){
			res2=res*0.8;
		}else if(res>500){
			res2=res*0.9;
		}else {
			res2=res;
		}
		System.out.println("가격은 "+res2+"원 입니다.");
	}
}


