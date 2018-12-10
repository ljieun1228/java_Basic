		// Lotto 6개의 랜덤 숫자.
		//1~45까지 랜덤 숫자.

package day9;

import java.util.Random;

public class LottoNumberGen {
	public void test(){

		System.out.println("로또숫자추출기");
		Random random = new Random();
		int [] lotto = new int[6];
		int res = 0;
		
		for(int i=0;i<lotto.length;i++){
			int ran = random.nextInt(45)+1;
			if (i<lotto.length-1){
				res =ran;
			}
			System.out.println(res+"");
		}
	}
	public static void main(String[] args) {
		LottoNumberGen gen = new LottoNumberGen();
		gen.test();
	}
}
