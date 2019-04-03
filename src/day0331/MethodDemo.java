package day0331;
//方法的演示
public class MethodDemo {

	public static void main(String[] args) {
		say();
		
		//sayHi();//编译错误，有参则必须传参
		//sayHi(250);//编译错误，参数类型匹配
		sayHi("baba");//String name = "baba"
		
		double a = getNum();//getNum()的值就赋给a
		System.out.println(a);//88.88
		
		int b = plus(5,6);// int num1=5,int num2 = 6
		System.out.println(b);//11
		
		int c = 5, d = 6;
		int e = plus(c,d);//int num1=5,int num2 = 6;
		System.out.println(e);
	}
	
	//有参数有返回值de方法
	public static int plus(int num1,int num2) {
		int num = num1 + num2;
		return num;//返回的是num中的那个数
		//return num1+num2;
	}
	
	//无参有返回值de方法
	public static double getNum() {
		//return;//编译错误，必须返回一个数
		//return"abc";//编译错误，返回值类型必须匹配
		return 88.88;//1)结束方法的执行 2）返回结果给调用方
	}
	
	//无参无返回值de方法
	public static void say() {
		System.out.println("大家好！我叫陶龙杰");
	}
	
	//有参无返回值de方法
	public static void sayHi(String name) {
		System.out.println("大家好！我叫"+name);
	}

}

/*
方法可以有返回值也可以没有返回值：
1)无返回值---返回值类型写成void
2)有返回值---返回值类型写成具体的数据类型

若方法操作后，还需要用到方法中的某个数据
--------------有返回值的  System.arraycopy(a,1,a1,0,4);
若方法操作后，不在需要用到方法中的数据
--------------无返回值的  int[] b = Arrays.copyOf(a,6);

方法可以有参数或者无参数
--------------有参数可以使方法更加灵活
*/