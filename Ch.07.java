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
