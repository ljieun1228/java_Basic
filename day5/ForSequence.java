package day5;

import java.util.Scanner;

public class ForSequence {
	public static void main(String[] args) {
		System.out.println("for 문을 사용하여 숫자 더한 값 출력하기");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String res = "";
		int sum = 0;
		for(int i = 1;i<=a;i++){
			if(i!=a){
				res+=i+"+";
			}else{
				res+=i+"=";
			}
			sum+=i;
		}
		System.out.println(res+sum);
	}
}
