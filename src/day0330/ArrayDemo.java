package day0330;
//数组练习
public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr1 = new int [10];
		int[] arr2 = {2,5,8};
		int[] arr3 = new int[] {2,5,8};
		int[] arr = new int[3];
		System.out.println(arr.length);
		arr[0] = 25;
		arr[1] = 35;
		arr[2] = 45;
//		arr[3] = 55;
		System.out.println(arr[arr.length-1]);
	}

}
