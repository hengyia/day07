package lianXi;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入班级人数:");
		int namber=sc.nextInt();
		int[] arr=new int[namber];
		Random r=new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i]=r.nextInt(101);
		}
		int sum=0;
		int count=0;
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<60){
				count++;
			}
		}
		int avg=sum/namber;
		System.out.println(max);
		System.out.println(count);
		System.out.println(avg);
	}

}
