package day0326;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*1000+1);
		System.out.println(num);
		
		int guess;
		do {
			System.out.println("请输入一个数（0退出）");
			guess = scan.nextInt();
			
			if(guess==0) {
				break;
			}
			
			if(guess>num) {
				System.out.println("太大了");
			}else if (guess<num) {
				System.out.println("太小了");
			}
			
		}while(guess != num);
		
		if (guess==num) {
			System.out.println("恭喜你！答对了");
		}else {
			System.out.println("欢迎下次再来");
		}
	}

}
