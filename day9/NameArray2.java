package day9;

public class NameArray2 {		
	public void test(){
		String name[] = {"홍길동","이순신","이성계","유관순"};
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
		NameArray2 a = new NameArray2();
		a.test();
	}
}



