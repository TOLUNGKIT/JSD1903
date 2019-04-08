package day0404;
import java.util.Scanner;
public class 斐波那契数列 {
//1,1,2,3,5,8,13,21,34,55,89,144
//数列第一项和第二项是1，从第三项开始，每一项都等于前两项之和。
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("n=");
		int n = scan.nextInt();
		 f(n);
		 System.out.println(f(n));
		 
		 
		 /*  //验证当n比较大时候，相邻两项的比值接近黄金分割比值0.618
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
	
	
	//实现计算斐波那契数列第n项值的方法。
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
