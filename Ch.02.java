// VarEx1
public class VarEx1 {
	public static void main(String[] args) {
  		int year = 0;
		int age = 14;

		System.out.println(year);
		System.out.println(age);

		year = age + 2000;
		age = age + 1;

		System.out.println(year);
		System.out.println(age);
	}
}

// VarEx2
public class VarEx2 {
	public static void main(String[] args) {
  		int x = 10, y = 20;
		int tmp = 0;

		System.out.println("x:" + x + " y:" + y);

		tmp = x;
		x = y;
		y = tmp;

		System.out.println("x:" + x + " y:" + y);
	}
}

// StringEx
public class StringEx {
	public static void main(String[] args) {
		String name = "ja" + "va";
		String str = name + 8.0;

		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
	}
}

//PrintFEx1
public class PrintfEx1 {
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';

		int finger = 10;
		long big = 100_000_000_000L; // long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;

		int octNum = 010; // 8진수 10, 10진수로는 8
		int hexNum = 0x10; // 16진수 10, 10진수로는 16
		int binNum = 0b10; // 2진수 10, 10진수로는 2

		System.out.printf("s=%d%n", s);
		System.out.printf("b=%d%n", b);
		System.out.printf("c=%c, %d %n", c, (int) c);
		System.out.printf("finger=[%5d]%n", finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
	}
}

//PrintFEx2
public class PringfEx2 {
	public static void main(String[] args) {
		String url = "https://github.com/ur-developer";

		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.2345689;

		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);

		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d);

		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.8s]%n", url);
	}
}

//ScannerEx

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);

		System.out.println("입력내용 : " + input);
		System.out.printf("num=%d%n", num);
	}
}

// CharToCode
public class CharToCode {
	public static void main(String[] args) {

		char ch = 'A';
		int code = (int) ch;

		System.out.printf("%c=%d(%#X)%n", ch, code, code);

		char hch = '가';
		System.out.printf("%c=%d(%#X)%n", hch, (int) hch, (int) hch);
	}
}

// SpecialCharEx
public class SpecialCharEx {
	public static void main(String[] args) {

		System.out.println('\'');
		System.out.println("abc\t123\b456");
		System.out.println('\n');
		System.out.println("\"Hello\"");
		System.out.println("c:\\");
	}
}

// OverflowEx
public class OverflowEx {
	public static void main(String[] args) {
	
		short sMin = -32768;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;

		System.out.println("sMin   = " + sMin);
		System.out.println("sMin-1 = " + (short) (sMin - 1));
		System.out.println("sMax   = " + sMax);
		System.out.println("sMax+1 = " + (short) (sMax + 1));
		System.out.println("cMin   = " + (int) cMin);
		System.out.println("cMin-1 = " + (int) --cMin);
		System.out.println("cMax   = " + (int) cMax);
		System.out.println("cMax+1 = " + (int) ++cMax);
	}
}

// FloatEx1
public class FloatEx1 {
	public static void main(String[] args) {
		
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;

		System.out.printf("       123456789012345678901234%n");
		System.out.printf("f  :  %f%n", f);
		System.out.printf("f  :  %24.20f%n", f);
		System.out.printf("f2 :  %24.20f%n", f2);
		System.out.printf("d  :  %24.20f%n", d);
	}
}

// FloatToBinEx
public class FloatToBinEx {
	public static void main(String[] args) {
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);

		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i);
	}
}

// CastingEx1
public class CastingEx1 {

	public static void main(String[] args) {
		
		double d = 85.4;
		int score = (int) d;

		System.out.println("score=" + score);
		System.out.println("d=" + d);
	}
}

// CastingEx2
public class CastingEx2 {

	public static void main(String[] args) {
		int i = 10;
		byte b = (byte) i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);

		i = 300;
		b = (byte) i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);

		b = 10;
		i = (int) b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);

		b = -2;
		i = (int) b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);

		System.out.println("i=" + Integer.toBinaryString(i));
	}
}

// CastingEx3
public class CastingEx3 {

	public static void main(String[] args) {

		float     f  = 9.1234567f;
		double d  = 9.1234567;
		double d2 = (double) f;

		System.out.printf("f  = %20.18f\n", f);
		System.out.printf("d  = %20.18f\n", d);
		System.out.printf("d2 = %20.18f\n", d2);
	}
}

//CastingEx4
public class CastingEx4 {

	public static void main(String[] args) {
		int   i  = 91234567;
		float f  = (float) i;
		int   i2 = (int) f;

		double d = (double) i;
		int i3 = (int) d;

		float f2 = 1.666f;
		int i4 = (int) f2;

		System.out.printf("i=%d\n", i);
		System.out.printf("f=%f i2=%d\n", f, i2);
		System.out.printf("d=%f i3=%d\n", d, i3);
		System.out.printf("(int)%f=%d\n", f2, i4);
	}
}
