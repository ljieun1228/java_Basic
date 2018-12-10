package day7;

import java.util.Scanner;

public class Forloopdemo {

	public static void main(String[] args) { 

		System.out.println("1부터 x까지의 숫자의 합");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();		
		String result = "";
		int sum = 0;
		for(int i=1;i<=count;i++){
			if(i!=count){
				result+=i+"+";
			}else{
				result+=i+"=";
			}
			sum+=i;
		}
		System.out.println(result+sum);
	}
}
