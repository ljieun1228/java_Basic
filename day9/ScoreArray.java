package day9;

import java.util.Scanner;

public class ScoreArray {
	public void test(){
		Scanner scan = new Scanner(System.in);
		System.out.println("학생수 몇명?");
		int count = scan.nextInt();
		String[] names = new String[count];
		int [] scores = new int[count];
		int iter =0;
		while(true){
			System.out.println("[종료.0 진행 1.]이름, 점수를 입력하세요.");
			String flag = scan.next();
			if(!flag.equals("0")|| iter!=count){
				String name = scan.next();
				int score = scan.nextInt();
				iter++;
			}else{
				System.out.println("종료");
				for (int i=0;i<names.length;i++){
				System.out.println(names[i]+":"+scores[i]);	
				
			}
		}
	}
}
	public static void main(String[] args) {
	ScoreArray c = new ScoreArray();
	c.test();
	}
}


