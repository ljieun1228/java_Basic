package day9;

public class NameArray {		
	public void test(){
		String name[] = new String[4];
		name [0] = "홍길동";
		name [1] = "이순신";
		name [2] = "이성계";
		name [3] = "유관순";
		String res = "";
		for (int i=0;i<4;i++){
			if(i!=3){
				res +=name[i]+",";
			}else{
				res +=name[i]+"";
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		NameArray a = new NameArray();
		a.test();
	}
}



