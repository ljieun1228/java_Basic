package day6;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		while(true){
			System.out.println("[메뉴] \n0.종료 \n"
					+ "1.계산기 \n"
					+ "2.BMI지수\n"
					+ "3.윤년계산\n"
					+ "4.주민번호\n"
					+ "5.등수구하기");
			String select = scanner.next();
			
			switch(select) {
			case "0" :
				System.out.println("종료");
				return;
				
			case"1":
				System.out.println("계산기를 실행할게요. 숫자,연산자,숫자를 입력 하세요.");
				int a = scanner.nextInt();
				String op = scanner.next(); 
				int b = scanner.nextInt();
				int result = 0;
				switch (op) {
				case "+": result = a+b;			
				break;
				case "-": result = a-b;			
				break;
				case "/": result = a/b;			
				break;
				case "*": result = a*b;			
				break;
				case "%": result = a%b;			
				break;
				default:result = 0;
				break;
				}
				System.out.println(result);
				break;
				
			case"2":
				System.out.println("체질량지수를 계산할게요.몸무게,키를 입력하세요.");
				double W = scanner.nextDouble();
				double H = scanner.nextDouble();
				double bmi = W/(H/100*H/100);
				System.out.println("당신의 BMI지수는"+bmi+"입니다. ");
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
				break;
				
			case"3":
				System.out.println("윤년인지 알아볼게요. 년도를 입력하세요.");
				int year = scanner.nextInt();
				if(year%4==0&&year%100==0||year%400==0) {
					System.out.println(year+"년은 윤년입니다.");
				}else {System.out.println(year+"년은 평년입니다.");}
				break;
							
						
				
			case"4":
				System.out.println("주민번호를 입력하세요.");
				String Ssn=scanner.next();
				char ch = Ssn.charAt(7);
				if(ch=='1'||ch=='3') {
					System.out.println("남자요");
				}else if(ch=='2'||ch=='4') {
					System.out.println("여자요");
				}else if(ch=='5'||ch=='6') {
					System.out.println("외국인이요");
				}else {}
				break;
				
			case"5":
				System.out.println("등수를 구해줄게요. 이름,성적을 입력하세요");
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
				break;
			}
			}
		}
	}

