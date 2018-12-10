package day4;

import java.util.Scanner;

public class GenderChecker {

	public static void main(String[] args) {
		System.out.println("~성별판별기~\n"
				+ "이름과 주민번호를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String Ssn=scan.next();
		char ch = Ssn.charAt(7);
		if(ch=='1'||ch=='3'){
			System.out.print("남자요.");
		}else if(ch=='2'||ch=='4'){
			System.out.print("여자요.");
		}else if(ch=='5'||ch=='6'){
			System.out.print("외국인이요.");
		}else {
			System.out.print( "다시 입력하세요.");
		}   
	}	    
}

