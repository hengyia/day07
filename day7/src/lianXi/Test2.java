package lianXi;

public class Test2 {
	public static void main(String[] args) {
		int count=0;
		for (int i = 0; i < 100; i++) {
			int ge=i%10;
			int shi=i/10%10;
			if(ge!=9&&shi!=9){
				count++;
			System.out.print(i+"  ");
				if(count%5==0){
					System.out.println();
				}
			}
		}
	}
}
