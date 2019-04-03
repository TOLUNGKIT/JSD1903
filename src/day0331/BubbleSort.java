package day0331;
//冒泡 数组 升序
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] {34,54,77,23,56};
		
		for(int i = 0; i < arr.length-1; i ++) {//控制轮
			for(int j = 0; j < arr.length-1-i; j ++) {//控制次
				if(arr[j]>arr[j+1]) {//和它下一个元素比
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					
				//若前数大于后数则交换，保证前数小于后数（升序）
				//若前数小于后数则交换，保证前数大于后数（降序）
				}
			}
		}
		
		
		/*
		 * 原理：
		 * i = 0
		 * 	j = 0 34和54比  不换 （34,54,77,23,56）
		 * 	j = 1 54和77比  不换 （34,54,77,23,56）
		 * 	j = 2 77和23比  换     （34,54,23,77,56）
		 * 	j = 3 77和56比  换     （34,54,23,56,77）
		 * 
		 * i = 1
		 * 	j = 0 34和54比 不换 （34,54,23,56,77）
		 *  j = 1 54和23比 换     （34,23,54,56,77）
		 *  j = 2 54和56比 不换 （34,23,54,56,77）
		 *  
		 * i = 2
		 * 	j = 0 34和23比 换 （23,34,54,56,77）
		 * 	j = 1 34和54比 不换（23,34,54,56,77）
		 * 
		 * i = 3
		 * 	j = 0 23和34比 不换 （23,34,54,56,77）
		 * 
		 * 
		 */
		
		for(int i = 0; i < arr.length; i ++) {
			System.out.println(arr[i]);
		}		

	}

}