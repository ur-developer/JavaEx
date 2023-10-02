//Ex7_1
class TV {
	boolean power; // 전원상태(on/off)
	int channel;   // 채널
	
	void power() 		{ power = !power; }
	void channelUp()	{ ++channel;      }
	void channelDown()  { --channel;      }
}

class SmartTv extends TV { // SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption; 	   // 캡션상태(on/off)
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

class Ex7_1 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;			// 조상 클래스로부터 상속받은 멤버
		stv.channelUp();			// 조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true; // 캡션(자막) 기능을 켠다.
		stv.displayCaption("Hello, World");
	}
}

<Console>
11
Hello, World

//Ex7_2
public class Ex7_2 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent { int x = 10; /* super.x */ }

class Child extends Parent {
	int x = 20; // this.x
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
}

<Console>
x=20
this.x=20
super.x=10

//Ex7_3
public class Ex7_3 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}

class Parent2 { int x = 10; /* super.x 와 this.x 둘 다 가능 */}

class Child2 extends Parent2 {
	void method() {
	System.out.println("x=" + x);
	System.out.println("this.x=" + this.x);
	System.out.println("super.x="+ super.x);
	}
}

<Console>
x=10
this.x=10
super.x=10

//Ex7_4
public class Ex7_4 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println("x=" + p.x + ",y=" + p.y + ",z=" + p.z);
	}
}

class Point { 
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;		
	}
}

class Point3D extends Point {
	int z;
	Point3D(int x, int y, int z) {
		super(x,  y); // Point(int x, int y)를 호출
		this.z = z;
	}
}

<Console>
x=1,y=2,z=3

//Ex7_7
public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // car = (Car)fe; 에서 형변환이 생략됨
//		car.water();
		fe2 = (FireEngine)car; // 자손타입 , 
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() { // 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() { // 멈추는 기능
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car { // 소방차
	void water() { // 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}

<Console>
water!!!
water!!!

//Ex7_8
class Product {
	int price;
	int bonusPoint; 
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product {
	Tv1() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100); // Tv의 가격을 100만원으로 한다.
	}

	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toStirng() { return "Computer"; }
}

class Buyer { // 고객, 물건을 사는사람
	int money = 1000; // 소유금액
	int bonusPoint = 0 ; // 보너스 점수
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
		System.out.println(p + " 을/를 구입하셨습니다.");
	}
}

public class Ex7_8 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money +"만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}
}

<Console>
Tv 을/를 구입하셨습니다.
Ch7.Computer@379619aa 을/를 구입하셨습니다.
현재 남은 돈은 700만원입니다.
현재 보너스점수는 30점입니다.
