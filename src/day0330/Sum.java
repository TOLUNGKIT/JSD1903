package day0330;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		
		//求和9+99+999+...+9999999999
//		long num = 0L;
//		long sum = 0L;
//		for (int i = 1; i <= 10; i ++) {
//			num = num * 10 + 9;
//			sum = sum + num;
//			System.out.println(num);
//			System.out.println(sum);
//		}
//		System.out.println(sum);
		
		//求和1+1/2+1/3+...+1/n
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入整数（例如10）");
		double n = scan.nextDouble();
		double sun = 0.0;
		for(int i = 1; i <= n; i ++) {
			sun = sun + 1.0/i;
		}
		System.out.println(sun);

	}

}
