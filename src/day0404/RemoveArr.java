package day0404;
//class������������һ������͸������е�ĳһԪ�ص�λ��ʱ�������㷨���������еĸ�λ�õ�Ԫ��ɾ��
//���磺��һ�����飬��Ԫ������Ϊ{2,3,4,5,6}����ɾ��λ��Ϊ1��Ԫ�غ󣬸������Ԫ�����ݸ���Ϊ{2,4,5,6}��
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
	
	//class�����е��㷨��Ҫ��ͨ��һ��������ʵ�֣��÷���������������ʾ
	//����ary���õ���ԭ���飻
	//����index��ʾ��Ҫɾ����Ԫ�ص�λ�ã�
	//����ֵΪɾ����ָ��λ��Ԫ�غ�����顣
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
