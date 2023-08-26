//Ex_7

import java.text.DecimalFormat;
public class Ex_7 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#,###E0");

		try {
			Number num = df.parse("1,234,567.89" + " -> ");
			System.out.print("1,234,567.89" + " -> ");

			double d = num.doubleValue();
			System.out.print(d + " -> ");

			System.out.println(df2.format(num));

		} catch (Exception e) {
		}
	}
}
<Console>
1,234,567.89 -> 1234567.89 -> 123.5E4

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


//Ex10_9
public class Ex10_9 {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

		try {
			Date d = df.parse("2019년 11월 23일");
			System.out.println(df2.format(d));
		} catch (Exception e) {
		}
	}
}
<Console>
2019/11/23