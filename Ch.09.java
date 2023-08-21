// Ex9_1
public class Ex9_1 {

	public static void main(String[] args) {
		Value v1 = new Value(20);
		Value v2 = new Value(20);

		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1와 v2는 다릅니다.");
	}
}
class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
}

//Ex9_2
class Person {
	long id;

	public boolean equals(Object obj) {
		if (obj instanceof Person)
			return id == ((Person) obj).id;
		else
			return false;
	}

	Person(long id) {
		this.id = id;
	}
}

public class Ex9_2 {

	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);

		if (p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p는 다른 사람입니다.");
	}
}

public class Ex9_3 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}

// Ex9_4
public class Ex9_4 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}

public class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}

public class Ex9_5 {

	public static void main(String[] args) {
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("HEART", 10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}

public class Card2 {
	String kind;
	int number;

	Card2() {
		this("SPADE", 1); // Card(String kind, int number)를 호출
	}

	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		// Card2인스턴스의 kind와 number를 문자열로 반환한다.
		return "kind : " + kind + ", number : " + number;
	}
}