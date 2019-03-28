package day0326;
import java.util.Scanner;
public class Guessing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*100+1);
		System.out.println(num);

		
		int guess;
		do {
			System.out.println("猜吧（输入0可以结束）");
			guess = scan.nextInt();
			
			if(guess==0) {
				break;
			}
			if(guess>num) {
				System.out.println("太大了");
			}else if (guess < num) {
				System.out.println("太小了");
			}
		}while(guess != num);
		
		if (guess==num) {
		System.out.println("恭喜你答对了");
		}else {
			System.out.println("欢迎下次再来");
		}
		
		
		/*
		System.out.println("猜吧(0~100)");
		int guess = scan.nextInt();
		
		while(guess!=num) {
			if (guess==0) {
				break;
			}
			if (guess>num) {
				System.out.println("太大了");
			}else{
				System.out.println("太小了");
			}
			
			System.out.println("继续猜吧！");
			guess = scan.nextInt();
		}
		
		if(guess==num) {
			System.out.println("恭喜你猜对了！");
		}else {
			System.out.println("欢迎下次再来！");
		}
		*/
		
	}

}
