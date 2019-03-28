package day0321;
import java.util.Scanner;//1.
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//2.
		
		System.out.println("请输入年龄");//提示
		
		int age = scan.nextInt();//3.
		
		System.out.println("请输入价格");
		
		double price = scan.nextDouble();
		
		System.out.println(age);//输出
		System.out.println(price);

	}

}
