package day7;

import java.util.Scanner;

public class Year {
	public void Year(){
		System.out.println("윤년구하기~년도 입력");
		Scanner scanner = new Scanner(System.in);
		int ye = scanner.nextInt();
		if(ye%4==0&&ye%100!=0||ye%400==0){
			System.out.println("윤년");
		}else{
			System.out.println("평년");
		}
	}
}
