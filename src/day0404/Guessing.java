package day0404;
//���ַ���Ϸ����֤�룩
import java.util.Scanner;
public class Guessing {
	//������
	public static void main(String[] args) {
		
		/*  //test�����������������������жԱ�
		char[] chs = {'A','B','C','D','E'};
		char[] input = {'R','G','B','D','E'};
		int[] result = check(chs,input);
		System.out.println(result[0]+" "+result[1]);
		*/
		
		/*
		//test��������ɲ��ظ����ַ�
		char[] a = generate();
		System.out.println(a);
		*/
		Scanner scan = new Scanner(System.in);
		char[] chs = generate();//��ȡ����ַ�
		System.out.println(chs);//����
		
		int count = 0;//�´�Ĵ���
		
		do {
			System.out.println("�°�");
			String str = scan.next().toUpperCase();//��ȡ�û������ַ���.toUpperCase()ת���ɴ�д��toLowerCase()ת����Сд
			char[] input = str.toCharArray();//���ַ���ת��Ϊ�ַ�����
			int[] result = check(chs,input);//
			
			if(result[0]==chs.length){//����µ�λ��ȫ����
				int score = 100*chs.length-count*10;
				System.out.println("��ϲ������;"+"�÷֣�"+score);
				break;//����ѭ��
			}else {//�����
				System.out.println("�ַ��Ը���Ϊ��"+result[1]+"�ַ��Ե�λ��Ϊ��"+result[0]);
				count ++;
			}
		}while(true);//������ѭ��
		

	}
	
	//��������ַ�����
	public static char[] generate() {
		char[] chs = new char[5];//����ַ�����
		char[] letter = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
				'O','P','Q','R','S','T','U','V','W','X','Y','Z'};//����ַ���Χ����
		boolean[] judge = new boolean[letter.length];//�������飨��letter���Ӧ��
		
		for(int i = 0; i < chs.length; i ++) {//��������ַ�����
			int index;
			do {
				index  = (int)(Math.random()*letter.length);//����±꣨0��25֮�䣩	
			}while(judge[index]==true);//���±�index��Ӧ�Ŀ���Ϊtrueʱ����ʾ�ַ��Ѿ����ֹ�
										//���±�index��Ӧ�Ŀ���Ϊfalseʱ����ʾ�ַ���δ���ֹ�
			
			judge[index] = true;//���±�index��Ӧ�Ŀ����޸�Ϊtrue����ʾ�ַ��Ѵ��
			chs[i] = letter [index];//�����±�index��letter�л�ȡ��Ӧ���ַ����������chs
			
		}
		return chs;
	}
	
	//�Աȣ�����ַ��������û�������ַ�����
	public static int[] check(char[] chs,char[] input) {
		int [] result = new int[2];//�ԱȽ��
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
