package day0325;
//命令解析程序
import java.util.Scanner;
public class CommandBySwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入命令：1.显示全部记录 2.查询登录记录 0.退出");
		int command = scan.nextInt();
		
		
		switch(command) {
		case 1:
			System.out.println("显示全部记录");
			break;
		case 2:
			System.out.println("查询登录记录");
			break;
		case 0:
			System.out.println("退出");
			break;
		default:
			System.out.println("输入有误");
		}
		
		
		/*
		if (command==1) {
			System.out.println("显示全部记录");
		}else if (command==2) {
			System.out.println("查询登录记录");
		}else if (command==0) {
			System.out.println("退出");
		}else {
			System.out.println("输入有误");
		}
		*/

	}

}
