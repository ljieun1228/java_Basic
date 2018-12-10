package day4;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("~윤년판독기~");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		String res = "";
		if (year%4==0&&year%100!=0||year%400==0){
			res = "윤년";
		}else{
			res = "평년";
		}
		System.out.println(year+"년은 "+res+"입니다.");
	}
}
