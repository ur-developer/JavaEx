//OperatorEx1
public class OperatorEx1 {

	public static void main(String[] args) {

		int i = 5;
		i++;
		System.out.println(i);

		i = 5;
		++i;
		System.out.println(i);
	}
}

//OperatorEx2
public class OperatorEx2 {

	public static void main(String[] args) {
		int i = 5, j = 0;

		j = i++;
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);

		i = 5;
		j = 0;

		j = ++i;
		System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);
	}
}

//OperatorEx3
public class OperatorEx3 {

	public static void main(String[] args) {

		int i = 5, j = 5;
		System.out.println(i++);
		System.out.println(++j);
		System.out.println("i = " + i + ", j =" + j);
	}
}

//OperatorEx4
public class OperatorEx4 {
	public static void main(String[] args) {
		int i = -10;
		i = +i;
		System.out.println(i);

		i = -10;
		i = -i;
		System.out.println(i);
	}
}

//OperatorEx5
public class OperatorEx5 {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;

		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.printf("%d / %f = %f%n", a, (float) b, a / (float) b);
	}
}

//OperatorEx6
public class OperatorEx6 {

	public static void main(String[] args) {
		byte a = 20;
		byte b = 30;
		byte c = (byte) (a + b); // a + b; = error
		System.out.println(c);
	}
}

//OperatorEx7
public class OperatorEx7 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte) (a * b); // 값손실 44
		System.out.println(c);
	}
}

//OperatorEx8
public class OperatorEx8 {

	public static void main(String[] args) {
		int a = 1_000_000; //long
		int b = 2_000_000; //long

		long c = a * b; // int-1454759936 / long 2000000000000

		System.out.println(c);
	}
}

//OperatorEx9
public class OperatorEx8 {

	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;

		System.out.println("a=" + a); // a=-727379968
		System.out.println("b=" + b); // b=1000000000000
	}
}

//OperatorEx10
public class OperatorEx10 {

	public static void main(String[] args) {
		int a = 1000000;

		int result1 = a * a / a;
		int result2 = a / a * a;

		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); // -727 overflow
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2); // 1000000
	}
}

//OperatorEx21
public class OperatorEx21 {

	public static void main(String[] args) {
		System.out.printf("10 == 10.0f  \t %b%n", 10 == 10.0f);    // true
		System.out.printf("'0'== 0      \t %b%n", '0' == 0);       // false
		System.out.printf("'A' == 65    \t %b%n", 'A' == 65);      // true
		System.out.printf("'A' > 'B'    \t %b%n", 'A' > 'B');      // false
		System.out.printf("'A'+1 != 'B' \t %b%n", 'A' + 1 != 'B'); // false
	}
}

//OperatorEx24
public class OperatorEx24 {

	public static void main(String[] args) {
		int x = 0;
		char ch = ' ';

		x = 15; // true
		System.out.printf("x=%2d, 10 < x && x < 20 =%b%n", x, 10 < x && x < 20);

		x = 6;
		// true
		System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x%%6!=0 =%b%n", x, x % 2 == 0 || x % 3 == 0 && x % 6 != 0);
		// false
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6!=0 =%b%n", x, (x % 2 == 0 || x % 3 == 0) && x % 6 != 0);

		ch = '1'; // true
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b%n", ch, '0' <= ch && ch <= '9');

		ch = 'a'; // true
		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' =%b%n", ch, 'a' <= ch && ch <= 'z');

		ch = 'A'; // true
		System.out.printf("ch='%c', 'A' <= ch && ch <= 'z' =%b%n", ch, 'A' <= ch && ch <= 'z');

		ch = 'q'; // true
		System.out.printf("ch='%c', ch=='q' || ch=='Q' =%b%n", ch, ch == 'q' || ch == 'Q');
	}
}
