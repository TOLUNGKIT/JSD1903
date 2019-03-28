package day0326;
//while 的演示
public class WhileDemo {

	public static void main(String[] args) {
		
		/*
		int times = 0;
		while (times<10) {
			System.out.println("行动是成功的阶梯");
			times ++;
		}*/
		
		/*
		int times = 1;
		while (times <= 9) {
			System.out.println(times+"*9="+(times*9));
			times ++;
		}*/
		
		/*
		int times = 9;
		while (times>0) {
			System.out.println(times+"*9="+(times*9));
			times--;
		}*/
		
		int times = 1;
		while(times<10) {
			System.out.println(times+"*9="+(times*9));
			times +=2;
		}

	}

}
