package day0328;
//随机加法运算器
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0 ;
		for ( int i = 1; i<=10 ; i++) {
			int a = (int)(Math.random()*100);
			int b = (int)(Math.random()*100);
			int reasult = a + b;
			System.out.println("("+i+")"+a+"+"+b+"=?");//出题
			
			System.out.println("算吧！");
			int answer = scan.nextInt();//答题
			
			if(answer==-1) {
				break;//输入-1可以退出循环
			}
			
			if(answer==reasult){
				score += 10;
				System.out.println("答案正确！");
			}else if(answer!=reasult) {
				System.out.println("答案错误！");
			}//判题
		}
		System.out.println("总得分："+score);
	}

}
