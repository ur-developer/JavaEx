public class Tv {
	boolean power;
	int channel;
	void power() {power = !power;	}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

public class SmartTv extends Tv {
	boolean caption;
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);}
	}
}

public class Example7_1 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 20;                       // 조상 클래스로부터 상속받은 멤버
		stv.channelUp();                         // 조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;
		stv.displayCaption("Hello, World");
	}
}

public class Parent {int x = 20; /* super.x */}

public class Child extends Parent {
	int x = 30; // this.x

	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}

public class Ex7_2 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}
public class FireEngine extends Car {
	void water() {
		System.out.println("watter!!!");
	}
}

public class Car {
	String color;
	int door;

	void drive() {
		System.out.println("drive, Brrrr~");
	}

	void stop() {
		System.out.println("stop");
	}
}

public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe; // car = (car)fe;에서 형변환이 생략됨
//		car.water(); // car타입의 참조변수로는 water()를 호출할 수 없다.
		fe2 = (FireEngine) car;
		fe2.water();
	}
}

public class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

public class Tv1 extends Product {
	Tv1() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

public class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "computer";
	}
}

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}

public class Ex7_8 {

	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv1());
		b.buy(new Computer());

		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}
}

public class Ex7_10 {

	public static void main(String[] args) {
		Unit[] group = { new Marine(), new Tank(), new Dropship() };

		for (int i = 0; i < group.length; i++)
			group[i].move(100, 200);
	}
}

abstract class Unit {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		/* 현재 위치에 정지 */ }
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ", y=" + y + "]");
	}

	void stimPack() {
		/* 스팀팩을 사용한다. */ }
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ", y=" + y + "]");
	}

	void changeMode() {
		/* 공격모드를 변환한다. */ }
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}

	void load() {
		/* 선택된 대상을 태운다. */ }

	void unload() {
		/* 선택된 대상을 내린다. */ }
}