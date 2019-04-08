package day0404;
//猜字符游戏（验证码）
import java.util.Scanner;
public class Guessing {
	//主方法
	public static void main(String[] args) {
		
		/*  //test：将输入输出与生成数组进行对比
		char[] chs = {'A','B','C','D','E'};
		char[] input = {'R','G','B','D','E'};
		int[] result = check(chs,input);
		System.out.println(result[0]+" "+result[1]);
		*/
		
		/*
		//test：随机生成不重复的字符
		char[] a = generate();
		System.out.println(a);
		*/
		Scanner scan = new Scanner(System.in);
		char[] chs = generate();//获取随机字符
		System.out.println(chs);//作弊
		
		int count = 0;//猜错的次数
		
		do {
			System.out.println("猜吧");
			String str = scan.next().toUpperCase();//获取用户输入字符串.toUpperCase()转换成大写，toLowerCase()转换成小写
			char[] input = str.toCharArray();//将字符串转化为字符数组
			int[] result = check(chs,input);//
			
			if(result[0]==chs.length){//如果猜的位置全对了
				int score = 100*chs.length-count*10;
				System.out.println("恭喜你答对了;"+"得分："+score);
				break;//结束循环
			}else {//如果错
				System.out.println("字符对个数为："+result[1]+"字符对的位置为："+result[0]);
				count ++;
			}
		}while(true);//自造死循环
		

	}
	
	//生成随机字符数组
	public static char[] generate() {
		char[] chs = new char[5];//随机字符数组
		char[] letter = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
				'O','P','Q','R','S','T','U','V','W','X','Y','Z'};//随机字符范围数组
		boolean[] judge = new boolean[letter.length];//开关数组（与letter相对应）
		
		for(int i = 0; i < chs.length; i ++) {//遍历随机字符数组
			int index;
			do {
				index  = (int)(Math.random()*letter.length);//随机下标（0到25之间）	
			}while(judge[index]==true);//当下标index对应的开关为true时，表示字符已经出现过
										//当下标index对应的开关为false时，表示字符还未出现过
			
			judge[index] = true;//将下标index对应的开关修改为true，表示字符已存过
			chs[i] = letter [index];//基于下标index到letter中获取对应的字符，并赋予给chs
			
		}
		return chs;
	}
	
	//对比：随机字符数组与用户输入的字符数组
	public static int[] check(char[] chs,char[] input) {
		int [] result = new int[2];//对比结果
		for(int i = 0; i < 5; i ++) {
			for(int j = 0; j < 5; j ++) {
				if (chs[i]==input[j]) {
					result[1] ++;
					if(chs[i]==input[i]) {
						result[0] ++;
					}
				}
			}
		}
		return result;
	}

}
