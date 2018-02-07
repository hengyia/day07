package lianXi;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第"+(i+1)+"个数据");
			arr[i]=sc.nextInt();
		}
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println("]");
		System.out.print("[");
		reverse(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println("]");
	}
		
		public static int[] reverse(int[] arr){
			for (int i = 0; i < arr.length/2; i++) {
				int temp=arr[i];
				arr[i]=arr[arr.length-1-i];
				arr[arr.length-1-i]=temp;
			}
			return arr;
		
	}

}
