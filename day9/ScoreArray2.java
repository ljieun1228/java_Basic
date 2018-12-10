package day9;

import java.util.Scanner;

public class ScoreArray2 {
	public void test(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수 3개 입력하세요");
		int g1 = scanner.nextInt();
		int g2 = scanner.nextInt();
		int g3 = scanner.nextInt();
		int[] arr = {g1,g2,g3};
		String res = "";
		for (int i=0;i<arr.length;i++){	
			if(i<arr.length-1){
				res+=arr[i]+",";
			}else{
				res+=arr[i];
			}
		}
		System.out.println(res);
	}
		public static void main(String[] args) {
		ScoreArray2 s = new ScoreArray2();
		s. test();
		}
	}

