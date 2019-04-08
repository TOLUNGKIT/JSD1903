package day0404;
//class描述：当给定一个数组和该数组中的某一元素的位置时，利用算法将该数组中的该位置的元素删除
//例如：有一个数组，其元素内容为{2,3,4,5,6}，当删除位置为1的元素后，该数组的元素内容更改为{2,4,5,6}。
import java.util.Arrays;

public class RemoveArr {

	public static void main(String[] args) {
		int[] ary = {2,3,4,5,6,7,8};
		int index = 5;

		int[] newAry = remove(ary,index);
		for(int i = 0; i < newAry.length; i ++) {
			System.out.print(newAry[i]+" ");
		}
	}
	
	//class描述中的算法，要求通过一个方法来实现，该方法的声明如下所示
	//参数ary引用的是原数组；
	//参数index表示想要删除的元素的位置；
	//返回值为删除掉指定位置元素后的数组。
	public static int[] remove(int[] ary,int index) {
		int[] newAry = new int[ary.length];
		for(int i = 0; i < ary.length; i ++) {
			newAry[i] = ary[i];
		}
		System.arraycopy(ary, index+1, newAry, index, ary.length-index-1);
		newAry = Arrays.copyOf(newAry, newAry.length-1);
		return newAry;
	}

}
