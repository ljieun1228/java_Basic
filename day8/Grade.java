package day8;

import java.util.Scanner;

public class Grade {
	
	public void grade(){
		System.out.println("등수를 구해줄게요. 이름,성적을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String n1 = scanner.next();
		int g1 = scanner.nextInt();
		String n2 = scanner.next();
		int g2 = scanner.nextInt();
		String n3 = scanner.next();
		int g3 = scanner.nextInt();
		
		if(g1>g2&&g2>g3) {
			System.out.println("1등" +n1 +g1+ "2등"+ n2 +g2 +"3등" +n3 +g3);
		}else if(g1>g3&&g3>g2) {
			System.out.println("1등" +n1 +g1+ "2등"+ n3 +g3 +"3등" +n2 +g2);
		}else if(g2>g1&&g1>g3) {
			System.out.println("1등" +n1 +g1+ "2등"+ n2 +g2 +"3등" +n3 +g3);
		}else if(g2>g3&&g3>g1) {
			System.out.println("1등" +n2 +g2+ "2등"+ n3 +g3 +"3등" +n1 +g1);
		}else if(g3>g1&&g1>g2) {
			System.out.println("1등" +n3 +g3+ "2등"+ n1 +g1 +"3등" +n2 +g2);
		}else {
			System.out.println("1등" +n3 +g3+ "2등"+ n2 +g2 +"3등" +n1 +g1);
		}	
	}
}

