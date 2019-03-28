package day0321;
//运算
public class OperDemo {

	public static void main(String[] args) {
		/*
		 * 1.�����������+,-,*,/,%,++,--
		 * 	1)%:ȡģ��ȡ�࣬����Ϊ0��Ϊ����
		 * 	2)++/--:����1/�Լ�1�����ڱ���ǰҲ���ڱ�����
		 * 		2.1)����ʹ��ʱ����ǰ�ں��޲��
		 * 		2.2)��ʹ��ʱ����ǰ�ں��в��
		 * 			a++��ֵΪa
		 * 			++a��ֵΪa+1
		 */
		
		/*
		System.out.println(5%2);//1,��2��1
		System.out.println(8%2);//0,��4��0----����
		System.out.println(2%8);//2,��0��2
		System.out.println(8.4567%2);//0.4567
		*/
		
		/*
		int a=5,b=5;
		a++;//�����ã��൱��a=a+1
		++b;//�����ã��൱��b=b+1
		System.out.println(a);//6
		System.out.println(b);//6
		*/
		
		/*
		int c=5,d=5;
		int e=c++;//��ʹ�ã�1)��c++��ֵ5��ֵ��e  2��c����1��Ϊ6
		int f=++d;//��ʹ�ã�1)��++d��ֵ6��ֵ��f  2��d����1��Ϊ6
		System.out.println(c);//6
		System.out.println(d);//6
		System.out.println(e);//5
		System.out.println(f);//6
		*/
		
		/*
		int g=5,h=5;
		System.out.println("g++=" + g++);//g++��ʹ�ã�5
		System.out.println("g="+ g);	 //6
		System.out.println("++h=" + ++h);//++h��ʹ��,6
		System.out.println("h=" + h);	 //6
		*/
		
		/*
		int i=5,j=10,k=5;
		boolean i1 = i>j;
		System.out.println(i1);//false
		System.out.println(k<j);//true
		System.out.println(i<=j);//true
		System.out.println(i>=k);//true
		System.out.println(i==k);//true
		System.out.println(i!=k);//false
		*/
		
		/*
		 * �����ĳ���£�����һ���������Ƶ�---��ϵ�����
		 * 		�ɼ�>=60
		 * 
		 * �����ĳ���£����ɶ���������Ƶ�---�߼������
		 * 		�ɼ�>=60���� ������>=80%
		 * 
		 * �ܱ�ҵ��			false	false	false	true
		 * 1�����Լ�����		true	false	false	true
		 * ����-----&&
		 * 2�������ʹ�80%��	false	true	false	true
		 * 
		 * �ܽ�����		true	true	true	false
		 * 1�����ֽ���	true	false	true	false
		 * ����-----||
		 * 2���п���		false	true	true	false
		 * 
		 * ��	 	false	true
		 * �����ˣ�	true	false
		 * 
		 * 
		 * 3.�߼��������
		 * 	1�� &&:�߼��루���ң������߶�Ϊ����Ϊ�棬��false��Ϊfalse
		 * 			����1����Ϊfalse��������·������Ĳ�ִ���ˣ�
		 * 	   ||:�߼��򣨻��ߣ�����һ��Ϊ����Ϊ�棬��true��Ϊtrue
		 * 			����1����Ϊtrue��������·������Ͳ�ִ���ˣ�
		 * 		!:�߼��ǣ�ȡ������������٣��Ǽ�����
		 *	2���߼������ǽ����ڹ�ϵ����Ļ���֮�ϵģ�
		 *		�߼�����Ľ��Ҳ��boolean��
		 * 
		 */
		
		/*
		int a=5,b=10,c=5;
		boolean b1 = a>=b && c<b;
		System.out.println(b1);//false&&true=false
		System.out.println(c<=b && a>b);//true&&false=false
		System.out.println(a==b && c>b);//false&&false=false
		System.out.println(a!=b && c<b);//true&&true=true
		
		System.out.println(a>=b || c<b);//false||true=true
		System.out.println(c<=b || a>b);//true||false=true
		System.out.println(a!=b || c<b);//true||true=true
		System.out.println(a==b || c>b);//false||false=false
		
		boolean b2 = !(a>b);
		System.out.println(b2);		//!false=true
		System.out.println(!(a<b)); //!true=false
		*/
		
		/*
		int a=5,b=10,c=5;
		boolean b3 = a>b && c++>2;
		System.out.println(b3); //false
		System.out.println(c);	//5,�߼����false�����·��ִ��
		*/
		
		/*
		int a=5,b=10,c=5;
		boolean b4 = a<b || c++>5;
		System.out.println(b4); //true
		System.out.println(c);	//5,�߼����true�����·��ִ��
		*/
		
		/*
		int t = 8,g = 55;
		int max = t>g?t:g;//��Ŀ�����
		System.out.println("max="+max);
		*/
	}
}
