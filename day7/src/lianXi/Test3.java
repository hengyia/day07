package lianXi;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		System.out.println("请输入组个数:");
		int zu=sc.nextInt();
		System.out.println("请输入组人数:");
		int number=sc.nextInt();
		int[][] arr=new int[zu][number];
		int allSum=0;
		int allCount=0;
		double max=0;
		for (int i = 0; i < zu; i++) {
			int count=0;
			int sum=0;
			
			for (int j = 0; j < number; j++) {
				arr[i][j]=r.nextInt(101);
				allSum+=arr[i][j];
				sum+=arr[i][j];
				if(arr[i][j]<60){
					allCount++;
					count++;
				}
			}
			double avg=sum*1.0/number;
			if(avg>max){
				max=avg;
			}
			System.out.println(count);
			System.out.println(avg);
			
		}
		System.out.println(max);
		System.out.println(allCount);
		System.out.println(allSum*1.0/(zu*number));
		
		
		
		
	}

}
