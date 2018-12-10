package day7;

import java.util.Scanner;

public class Grade {
	public void Grade(){
		System.out.println("등수구하기이름점수이름점수이름점수");
		Scanner scanner = new Scanner(System.in);
		
		String name1 = scanner.next();
		int g1 = scanner.nextInt();
		String name2 = scanner.next();
		int g2 = scanner.nextInt();
		String name3 = scanner.next();
		int g3 = scanner.nextInt();
		
		if(g1>g2&&g2>g3){
			System.out.println("1등"+ name1+ g1+ "2등" +name2+ g2+ "3등"+ name3+ g3);
		}else{
		}
	}
		
}
