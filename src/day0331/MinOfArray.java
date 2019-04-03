package day0331;

import java.util.Arrays;

public class MinOfArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i < 10; i ++) {
			arr[i] = (int)(Math.random()*100);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int min = arr[0];
		for(int i = 1; i < 10; i ++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("最小值："+min);
		
//		int[] newArr = new int[arr.length+1];
//		System.arraycopy(arr, 0, newArr, 1, arr.length);
//		newArr[0] = min;
//		for(int i = 0; i < newArr.length; i ++) {
//			System.out.print(newArr[i]+" ");
//		}
		
		arr = Arrays.copyOf(arr, arr.length+1);
		arr [arr.length-1] = min;
		for(int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i]+" ");
		}

	}

}
