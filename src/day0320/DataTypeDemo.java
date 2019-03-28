package day0320;
//基本数据类型的演示
public class DataTypeDemo {
	public static void main(String[] args) {
		//1）int:整型，4个字节，-21个多亿到21个多亿
		int a = 250;//250为整数直接量，默认为int的类型
		//int b = 10000000000;//编译错误，100亿默认为int类型，但超出int的范围了
		
		System.out.println(5/2);//2
		System.out.println(2/5);//0
		System.out.println(5.0/2);//2.5
		
		int c = 2147483647;//int的最大值
		c = c+1;
		System.out.println(c);//int的最小值-2147483648
		
		//2)long:长整型，8个字节，很大
		//long d = 10000000000;//编译错误，100亿默认为int，但超出了int的范围
		long e = 10000000000L;
		
		//long运算时若有可能溢出，建议将L放在第一个数字后加L
		long f = 1000000000*2*10L;
		System.out.println(f);//200亿
		long g = 1000000000*3*10L;
		System.out.println(g);//溢出了
		long h = 1000000000L*3*10;
		System.out.println(h);//300亿
		
		//获取自1970.1.1零时到此时此刻的毫秒数
		long i = System.currentTimeMillis();
		System.out.println(i);
		
		//3）double:浮点型，八个字节，很大
		double j = 3.14;//浮点数直接量默认为double类型
		float k = 3.14F;//float直接量需在数字后加F或f
		
		double m = 3.0,n=2.9;
		System.out.println(m-n);//0.10000000000000009,舍入误差
		double q = 6.0,w=4.9;
		System.out.println(q-w);//1.0999999999999996,舍入误差
		
		//4)boolean:布尔型，1个字节
		boolean b1 = true;//true为布尔型的直接量
		boolean b2 = false;
		//boolean b3 = 250;//编译错误，布尔型只能取值为true和false
		
		//5)char:字符型，2个字节
		char c1 = '女';//声明字符型变量c1并赋值为字符女
		char c2 = 'f';//声明字符型变量c2并赋值为字符f
		char c3 = '6';//声明字符型变量c3并赋值为字符6
		char c4 = ' ';//声明字符型变量c4并赋值为空格符
		//char c5 = 男;//编译错误，字符直接量必须放在单引号里
		//char c6 = '';//编译错误，必须有字符
		//char c7 = '男性';//编译错误，只能有一个字符
		
		char c8 = 97;//0到65535
		System.out.println(c8);//a
		
		char c9 = '\r';
		System.out.println(c9);//回车
		
		char c10 = 98;//0到65535
		System.out.println(c10);//b
		
		//基本数据类型间的转换
		int a11 = 5;
		long b11 = a11;//自动类型转换
		int c11 = (int)b11;//强制类型转换
		
		long d11 = 5;//自动类型转换
		double e11 = 5;//自动类型转换
		
		long f11 = 10000000000L;
		int g11 = (int)f11;
		System.out.println(g11);//强制有可能发生溢出
		
		double h11 = 56.987654;
		int i11 = (int)h11;
		System.out.println(i11);//56   强转有可能丢失精度
		
		byte b22 = 5;
		byte c22 = 6;
		byte d22 = (byte)(b22+c22);//11
		
		System.out.println(2+2);    //4
		System.out.println('2'+'2');//100,'2'的码50，再加上，'2'的码50
	}

}
