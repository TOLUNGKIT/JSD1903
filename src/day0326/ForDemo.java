package day0326;

public class ForDemo {

	public static void main(String[] args) {
		/*
		int sun = 0;
		for (int num=1;num<=100;num++) {
			sun += num;
		}
		System.out.println("sun="+sun);
		*/
		
		int sun=1;
		for (int num=1;num<=10;num++) {
			sun *= num;
			System.out.println("sun*"+num+"="+sun);
		}
		System.out.println("sun="+sun);
		
		
		/*
		for(int times = 1 ; times <=10 ; times++) {
			System.out.println(times+"行动是成功的阶梯");
		}
		
		for(int num = 1  ; num<=9; num++) {
			System.out.println(num+"*9="+(num*9));
		}
		
		for(int num = 9 ; num>=1; num--) {
			System.out.println(num+"*9="+(num*9));
		}
		
		for (int num = 1; num <=9; num +=2) {
			System.out.println(num+"*9="+(num*9));
		}
		//执行过程：首先第一步执行循环变量数字等于1的初始化 ，第二部判断循环条件的数字是否小于等于9 ，第三步若true则执行循环体，false则退出for循环，第四步执行数字再加2
		 */
	}

}
