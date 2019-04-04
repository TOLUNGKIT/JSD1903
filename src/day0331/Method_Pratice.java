package day0331;
//封装一个方法generateArray，该方法实现生成指定长度的int数组，该数组的元素为0到指定范围内的随机数，并将该数组返回。

import java.util.Scanner;
public class Method_Pratice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入数组的长度：");
		int arrLength = scan.nextInt();
		System.out.println("为该数组的元素制定0~_范围，并生成0~_范围内的随机数：");
		int arrNumMax = scan.nextInt();
		
		int[] a =  generateArray(arrLength,arrNumMax);
		for(int i = 0; i < a.length; i ++) {
			System.out.print(a[i]+" ");
		}
	}


	public static int[] generateArray(int num,int random) {
		int[] arr = new int[num];
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = 0+(int)(Math.random()*random);	
		}
		return arr;
	}

}
