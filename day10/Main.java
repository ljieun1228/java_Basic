package day10;

import java.util.Random;
import java.util.Scanner;

import day9.*;//day 9 전체 다 불러올때 *

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("메뉴\n "
					+ "0.종료\n "
					+ "1.BMI\n "
					+ "2.계산기\n "
					+ "3.구구단\n "
					+ "4.로또\n "
					+ "5.이름 점수\n"
					+ "6.성적표\n ");
			switch(scanner.next()){
			case "0" : return;
			case "1" : 
				Bmi bmi = new Bmi();
				System.out.println("~체질량지수~\n"+ "키, 몸무게를 입력하세요.");
				System.out.println(bmi.test(scanner.nextDouble(),scanner.nextDouble()));
				break;
			case "2" :
				Calc calc = new Calc();
				System.out.println("계산기 실행합니다. 숫자를 입력하세요.");
				System.out.println(calc.calc(scanner.nextInt(),scanner.next(),scanner.nextInt()));
				break;
			case"3":
				Gugudan gu = new Gugudan();
				System.out.println("구구단 몇단?");
				System.out.println(gu.gugudan(scanner.nextInt()));
				break;
			case "4" :
				LottoNumberGen lo = new LottoNumberGen();
				System.out.println("로또숫자추출기");
				System.out.println(lo.test());
				break;
			case "5" : 
				ScoreArray2 sc = new ScoreArray2();
				System.out.println("학생수 몇명?");
				int count = scanner.nextInt();
				String[] names = new String[count];
				int[] scores = new int[count];
				for(int i=0;i<count;i++){
					System.out.println("이름, 점수를 입력하세요.");
					names[i] = scanner.next();
					scores[i] = scanner.nextInt();
				}				
				sc.test(names, scores);
				break;
			default : break;
			}		
		}
	}
}