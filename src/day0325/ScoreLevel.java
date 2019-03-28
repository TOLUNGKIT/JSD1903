package day0325;
import java.util.Scanner;
public class ScoreLevel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = scan.nextInt();
		
		/*
		if (score>=0 && score<=100) {
			if (score>=90) {
				System.out.println("A-优秀");
			}else if(score>=80){
				System.out.println("B-良好");
			}else if(score>=60) {
				System.out.println("C-中等");
			}else  {
				System.out.println("D-不及格");
			}
		}else {
			System.out.println("输入成绩有误");
		}*/

		
		if (score<0 || score>100) {
			System.out.println("输入成绩有误");
		}else if (score>=90) {
			System.out.println("A-优秀");
		}else if (score>=80) {
			System.out.println("B-良好");
		}else if (score>=60) {
			System.out.println("C-中等");
		}else {
			System.out.println("D-不及格");
		}
	}

}
