package day0325;
import java.util.Scanner;
public class Condition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入任意数字：");
		int num = scan.nextInt();
		
		if(num%2==0) {
			System.out.println(num+"是偶数");
		}else {
			System.out.println(num+"是奇数");
		}
		System.out.println("over");
	}

}
