package day0326;
import java.util.Scanner;
public class fenshu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入整数n的值： （1/n）求和");
		double n = scan.nextDouble();
		double num;
		double sun=0;
		for(num = 1; num<=n; num +=1){
			sun = sun + (1/num);
			System.out.println("sun="+sun);
			System.out.println("num="+num);
		}
		System.out.println(sun);

	}

}
