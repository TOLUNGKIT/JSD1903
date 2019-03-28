package day0321;
//闰年的测试
public class LeapYear {

	public static void main(String[] args) {
		int year =2019;
		boolean flag = (year%4==0 && year%100!=0) || year%400==0;
		String Str = flag?year+"是闰年":year+"不是闰年";
		System.out.println(Str);
	}

}
 