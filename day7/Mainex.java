package day7;

import java.util.Scanner;

public class Mainex {
	public static void main(String[] args) {
		System.out.println("객체불러오기연습");
		Scanner scanner = new Scanner(System.in);
		Bmi bm = new Bmi();
		Year ye = new Year();
		while(true){
			System.out.println("메뉴 1종료2bmi3윤년4성별");
			String select = scanner.next();
			switch(select){
			case "1":
				System.out.println("종료합니다"); 
				return;
			case "2":
				bm.Bmi();
				break;
			case "3":
				ye.Year();
				break;
			case "4":
				break;
			case "5":
				break;
			}
	
		}
	}
}
