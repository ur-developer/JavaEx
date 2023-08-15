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
