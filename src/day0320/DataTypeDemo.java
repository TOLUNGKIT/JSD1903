package day0320;
//�����������͵���ʾ
public class DataTypeDemo {
	public static void main(String[] args) {
		//1��int:���ͣ�4���ֽڣ�-21�����ڵ�21������
		int a = 250;//250Ϊ����ֱ������Ĭ��Ϊint������
		//int b = 10000000000;//�������100��Ĭ��Ϊint���ͣ�������int�ķ�Χ��
		
		System.out.println(5/2);//2
		System.out.println(2/5);//0
		System.out.println(5.0/2);//2.5
		
		int c = 2147483647;//int�����ֵ
		c = c+1;
		System.out.println(c);//int����Сֵ-2147483648
		
		//2)long:�����ͣ�8���ֽڣ��ܴ�
		//long d = 10000000000;//�������100��Ĭ��Ϊint����������int�ķ�Χ
		long e = 10000000000L;
		
		//long����ʱ���п�����������齫L���ڵ�һ�����ֺ��L
		long f = 1000000000*2*10L;
		System.out.println(f);//200��
		long g = 1000000000*3*10L;
		System.out.println(g);//�����
		long h = 1000000000L*3*10;
		System.out.println(h);//300��
		
		//��ȡ��1970.1.1��ʱ����ʱ�˿̵ĺ�����
		long i = System.currentTimeMillis();
		System.out.println(i);
		
		//3��double:�����ͣ��˸��ֽڣ��ܴ�
		double j = 3.14;//������ֱ����Ĭ��Ϊdouble����
		float k = 3.14F;//floatֱ�����������ֺ��F��f
		
		double m = 3.0,n=2.9;
		System.out.println(m-n);//0.10000000000000009,�������
		double q = 6.0,w=4.9;
		System.out.println(q-w);//1.0999999999999996,�������
		
		//4)boolean:�����ͣ�1���ֽ�
		boolean b1 = true;//trueΪ�����͵�ֱ����
		boolean b2 = false;
		//boolean b3 = 250;//������󣬲�����ֻ��ȡֵΪtrue��false
		
		//5)char:�ַ��ͣ�2���ֽ�
		char c1 = 'Ů';//�����ַ��ͱ���c1����ֵΪ�ַ�Ů
		char c2 = 'f';//�����ַ��ͱ���c2����ֵΪ�ַ�f
		char c3 = '6';//�����ַ��ͱ���c3����ֵΪ�ַ�6
		char c4 = ' ';//�����ַ��ͱ���c4����ֵΪ�ո��
		//char c5 = ��;//��������ַ�ֱ����������ڵ�������
		//char c6 = '';//������󣬱������ַ�
		//char c7 = '����';//�������ֻ����һ���ַ�
		
		char c8 = 97;//0��65535
		System.out.println(c8);//a
		
		char c9 = '\r';
		System.out.println(c9);//�س�
		
		char c10 = 98;//0��65535
		System.out.println(c10);//b
		
		//�����������ͼ��ת��
		int a11 = 5;
		long b11 = a11;//�Զ�����ת��
		int c11 = (int)b11;//ǿ������ת��
		
		long d11 = 5;//�Զ�����ת��
		double e11 = 5;//�Զ�����ת��
		
		long f11 = 10000000000L;
		int g11 = (int)f11;
		System.out.println(g11);//ǿ���п��ܷ������
		
		double h11 = 56.987654;
		int i11 = (int)h11;
		System.out.println(i11);//56   ǿת�п��ܶ�ʧ����
		
		byte b22 = 5;
		byte c22 = 6;
		byte d22 = (byte)(b22+c22);//11
		
		System.out.println(2+2);    //4
		System.out.println('2'+'2');//100,'2'����50���ټ��ϣ�'2'����50
	}

}
