package day9;

import java.util.Scanner;

public class ScoreArray3 {
	public void test(){
		Scanner scan = new Scanner(System.in);
		System.out.println("점수3개입력");
		
		int[] score = new int[3];
		for (int i=0;i<score.length;i++){
			score[i]=scan.nextInt(); 
		}
		/*int g1 = scan.nextInt();
		int g2 = scan.nextInt();
		int g3 = scan.nextInt();
		int [] name = {g1,g2,g3};**/
		
		String res = "";
		for(int i=0;i<score.length;i++){
			if(i<score.length-1){
				res+=score[i]+",";
			}else{
				res+=score[i];
			}
		}
	System.out.println(res);
	}
		public static void main(String[] args) {
		ScoreArray3 s = new ScoreArray3();
		s. test();
		}
	}

