package day0325;
import java.util.Scanner;
public class Cashier {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入单价：");
		double unitPrice = scan.nextDouble();
		System.out.println("请输入数量：");
		double amount = scan.nextDouble();
		System.out.println("请输入金额：");
		double money = scan.nextDouble();
		
		double totalPrice = unitPrice * amount;
		if(totalPrice>=500) {
			totalPrice *= 0.8;
		}
		
		if(money>=totalPrice) {
			double changeMoney = money - totalPrice;
			System.out.println("总价为："+totalPrice+",应找零为："+changeMoney);
		}else {
			System.out.println("ERROR!您给的钱不够还差"+(totalPrice-money));
		}	
	}

}
