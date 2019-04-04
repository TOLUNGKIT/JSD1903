package day0331;

import java.util.Arrays;

public class MaxOfArray_Pratice {

	public static void main(String[] args) {
		int[] arr1 = new int[10];
		for(int i = 0; i < arr1.length; i ++) {
			arr1[i] = (int)(Math.random()*100);
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		int max = arr1[0];
		for(int i = 1; i < arr1.length; i ++) {
			if(max<arr1[i]) {
				max = arr1[i];
			}
		}
		System.out.println("最大值："+max);
		
		
		//将最大值放在数组的最前面，先新建一个比数组arr1多一个变量的数组arr2，复制arr1的数组到arr2的第一个变量之后，将max赋值到arr2的最前面
		int[] arr2 = new int[arr1.length+1];
		System.arraycopy(arr1, 0, arr2, 1, arr1.length);
		arr2[0] = max;
		for(int i =0; i < arr2.length; i ++) {
			System.out.print(arr2[i]+" ");
		}
		

		
		/*
		//把最大值放在数组的最后面，用扩容数组
		arr1 = Arrays.copyOf(arr1,arr1.length+1);//扩容数组
		arr1[arr1.length-1]=max;//把最大值放在数组的最后一个变量
		for(int i = 0; i < arr1.length; i ++) {
			System.out.print(arr1[i]+" ");
		}//遍历数组，输出数组
		*/
	}

}
