package day0404;
import java.util.Scanner;
public class 쳲��������� {
//1,1,2,3,5,8,13,21,34,55,89,144
//���е�һ��͵ڶ�����1���ӵ����ʼ��ÿһ�����ǰ����֮�͡�
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("n=");
		int n = scan.nextInt();
		 f(n);
		 System.out.println(f(n));
		 
		 
		 /*  //��֤��n�Ƚϴ�ʱ����������ı�ֵ�ӽ��ƽ�ָ��ֵ0.618
		 int m = n-1;
		 f(m);
		 System.out.println(f(m));
		 
		 double z = f(n); double x = f(m);
		 System.out.println(z);
		 System.out.println(x);
		 
		 double result = x/z;
		 System.out.println(result);
		 */
	}
	
	
	//ʵ�ּ���쳲��������е�n��ֵ�ķ�����
	public static int f(int n) {
		int i=1;
		int j=1;
		int z=1;
		if(n==1) {
			System.out.println(i);
		}else if(n==2) {
			System.out.println(j);
		}else if(n>=3) {
			for(int x =1; x < n-1; x ++) {
				i=j;
				j=z;
				z=i+j;
			}
//			System.out.println(z);
		}
		return z;
	}

}
