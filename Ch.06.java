// Ex6_1
public class Ex6_1 {
	public static void main(String[] args) {
		Tv t;				// Tv인스턴스를 참조하기 위한 변수 t를 선언
		t = new Tv();		// Tv인스턴스를 생성한다.
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
		t.channel = 7;		// Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
		t.channelDown();    // Tv인스턴스의 메서드 channelDown()을 호출한다.
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
	}
}

class Tv {
	// Tv의 속성(멤버변수)
	String color;        // 색상
	boolean power;       // 전원상태(on/off)
	int channel;		 // 채널


	// Tv의 기능(메서드)
	void power()	    { power = !power; } // TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp()    { ++channel; }      // TV의 채널을 높이는 기능을 하는 메서드
	void channelDown()  { --channel; }      // TV의 채널을 낮추는 기능을 하는 메서드
}

<Console>
현재 채널은 0 입니다.
현재 채널은 7 입니다.
현재 채널은 6 입니다.

Ex6_2
public class Ex6_2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();  // Tv t1; t1 = new Tv();를 한 문장으로 가능
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 "  +t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "  +t2.channel + "입니다.");

		t1.channel = 7; // channel 값을 7로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");

		System.out.println("t1의 channel값은 "  +t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "  +t2.channel + "입니다.");
	}
}

<Console>
t1의 channel값은 0입니다.
t2의 channel값은 0입니다.
t1의 channel값을 7로 변경하였습니다.
t1의 channel값은 7입니다.
t2의 channel값은 0입니다.

Ex6_3
public class Ex6_3 {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number
						  + "이며, 크기는 (" + c1.width + " , " + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number
					      + "이며, 크기는 (" + c2.width + " , " + c2.height + ")");	
		System.out.println(("C1의 width와 height를 각각 50, 80으로 변경합니다."));
		c1.width  = 50;
		c1.height = 80;

		System.out.println("c1은 " + c1.kind + ", " + c1.number
						  + "이며, 크기는 (" + c1.width + " , " + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number
						  + "이며, 크기는 (" + c2.width + " , " + c2.height + ")");	
	}
	static class Card {
		String kind;
		int number;
		static int width  = 100;
		static int height = 250;
	}	
}

<Console>
Card.width = 100
Card.height = 250
c1은 Heart, 7이며, 크기는 (100 , 250)
c2는 Spade, 4이며, 크기는 (100 , 250)
C1의 width와 height를 각각 50, 80으로 변경합니다.
c1은 Heart, 7이며, 크기는 (50 , 80)
c2는 Spade, 4이며, 크기는 (50 , 80)


public class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;
	// return a + b; // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b ;
	}
}

//Ex6_4
public class Ex6_4 {
	public static void main(String[] args) {
	MyMath mm =  new MyMath();
	long result1 = mm.add(5L, 3L);
	long result2 = mm.subtract(5L, 3L);
	long result3 = mm.multiply(5L, 3L);
	double result4 = mm.divide(5L, 3L);
	
	System.out.println("add(5L, 3L) = " + result1);
	System.out.println("usbtract(5L, 3L) = " + result2);
	System.out.println("multiply(5L, 3L) = " + result3);
	System.out.println("divide(5L, 3L) = " + result4);
	}
}

class MyMath {
	long add(long a, long b ) {
		long result = a + b;
		return result;
		// return a + b; // 위의 두 줄을 이와 같이 한줄로 간단히 할 수 있다.
		}
		long subtract(long a, long b) {return a - b; }
		long multiply(long a, long b) {return a * b; }
		double divide(double a, double b) { 
			return a / b;
	}
}

<Console>
add(5L, 3L) = 8
usbtract(5L, 3L) = 2
multiply(5L, 3L) = 15
divide(5L, 3L) = 1.6666666666666667

//Ex6_5
public class Ex6_5 {
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}

<Console>
Hello


//Ex6_6
class Data { int x; }

public class Ex6_6 {

	public static void main(String[] args) {
			Data d = new Data();
			d.x = 10;
			System.out.println("main() : x = " + d.x);
			
			change(d.x);
			System.out.println("After change(d.x)");
			System.out.println("main() : x + " + d.x);
		}
	
	static void change(int x) { //기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}

<Console>
main() : x = 10
change() : x = 1000
After change(d.x)
main() : x + 10

class Data2 { int x;}

public class Ex6_7 {

	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
		static void change(Data2 d) { // 참조형 매개변수
			d.x = 1000;
			System.out.println("change() : x = " + d.x);
		}
}
	
<Console>
main() : x = 10
change() : x = 1000
After change(d)
main() : x = 1000


public class Data3 { int x;}

public class Ex6_8 {

	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;
		
		Data3 d2 = copy(d);
		System.out.println("d.x ="+d.x);
		System.out.println("d2.="+d2.x);
	}
		
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();
		
		tmp.x = d.x;
		
		return tmp;
	}
}

public class CallStackTest {

	public static void main(String[] args) {
		firstMethod();
	}

	static void firstMethod() {
		secondMethod();
	}

	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}

public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음.");
		firstmethod();
		System.out.println("main(String[] args)이 끝났음.");
	}

	static void firstmethod() {
		System.out.println("firstMethod()이 시작되었음.");
		secondMethod();
		System.out.println("firstMethod()이 끝났음.");
	}

	static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음.");
		System.out.println("secondMethod()이 끝났음.");
	}
}

public class Data {	int x; }

public class PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}

public class ReferenceParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x" + d.x);

		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}



public class OverloadingTest {

	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과:" + mm.add(3, 3));
		System.out.println("mm.add(3L, 3) 결과:" + mm.add(3L, 3));
		System.out.println("mm.add(3, 3L) 결과:" + mm.add(3, 3L));
		System.out.println("mm.add(3L, 3L) 결과:" + mm.add(3L, 3L));

		int[] a = { 100, 200, 300 };
		System.out.println("mm.add(a) 결과: " + mm.add(a));
	}
}

public class MyMath3 {

	int add(int a, int b) {
		System.out.println("int add(int a, int b) - ");
		return a + b;
	}

	public MyMath3() {
	}

	long add(int a, long b) {
		System.out.println("long add(int a, long b) - ");
		return a + b;
	}

	long add(long a, int b) {
		System.out.println("long add(long a, int b) - ");
		return a + b;
	}

	long add(long a, long b) {
		System.out.println("long add(long a, long b) - ");
		return a + b;
	}

	int add(int[] a) {
		System.out.println("int add(int[] a) -");
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}

public class Car {
	String color;
	String gearType;
	int door;

	Car() {}

	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class Ex6_12 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "Black";
		c1.gearType = "auto";
		c1.door = 2;

		Car c2 = new Car("Pink", "auto", 4);

		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
	}

}

public class Student {

	String name;
	int ban;
	int no;
	int java;
	int js;
	int sql;

	Student() {
	}

	Student(String name, int ban, int no, int java, int js, int sql) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.java = java;
		this.js = js;
		this.sql = sql;
	}

	int getTotal() {
		return java + js + sql;
	}

	float getAverage() {
		return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
	}

	public String

			info() {
		return name + "," + ban + "," + no + "," + java + "," + js + "," + sql + "," + getTotal() + "," + getAverage();
	}
}

public class Exercise6_2 {

	public static void main(String[] args) {
		Student s = new Student("박민기", 1, 1, 100, 60, 76);

		String str = s.info();
		System.out.println(str);
	}
}

public class Exercise6_3 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "박민기";
		s.ban = 1;
		s.no = 1;
		s.java = 100;
		s.js = 60;
		s.sql = 76;

		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("이름:" + s.getAverage());
	}
}