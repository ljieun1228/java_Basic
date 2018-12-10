package day6;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true){
			System.out.println("메뉴\n 0. 종료\n 1.계산기\n 2. bmi 지수\n 3. 윤년\n 4. 주민번호\n 5.등수구하기");
			String select = scanner.next();
			
			switch(select){
			case "0" :
				System.out.println("종료되었습니다.");
				return;
			case"1":
				System.out.println("계산기 실행합니다. 숫자를 입력하세요.");
				
				int a = scanner.nextInt();
				String op = scanner.next();
				int b = scanner.nextInt();
				int result = 0;
				
				switch(op){
			 	case "+" : result=a+b;
			 	break;
			 	case "-" : result=a-b;
			 	break;
			 	case "*" : result=a*b;
			 	break;
			 	case "/" : result=a/b; 
			 	break;
			 	case "%" : result=a%b;
			 	break;
				}
				System.out.println(a+op+b+"="+result);
				
			case"2":
				System.out.println("체지방지수를 알려드려요. 키와 몸무게를 입력하세요.");
				double h = scanner.nextDouble();
				double w = scanner.nextDouble();
				double bmi = w/(h/100)*(h/100);
				
				if (bmi>=40){
					System.out.println("고도비만");
				}else if (35<bmi&&bmi<39.9){
					System.out.println("중증도비만");
				} else if(30<bmi&&bmi<34.9){
					System.out.println("경도비만");
				}else if(25<bmi&&bmi<29.9){
					System.out.println("과체중");
				}else if(18.5<bmi&&bmi<24.9){
					System.out.println("정상");
				}else {
					System.out.println("저체중");
				}
				break;
				
			case"3":
				System.out.println("윤년계산할게여.년도를 입력하세요");
				int ye = scanner.nextInt();
				if(ye%4==0&&ye%100!=0||ye%100==0){
					System.out.println("윤년이요");
				}else{
					System.out.println("평년이요");
				}
				break;
			case"4":
				System.out.println("주민번호 말해주세요, 여자남자외국인 알려드릴게여");
				String ss = scanner.next();

				break;
			case"5":
				break;
			}
		}
		
	}

}
