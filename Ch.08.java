public class Ex8_1 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);
		}
		System.out.println(5);
	}
}

public class Ex8_2 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(0 / 0);
			System.out.println(2);
		} catch (ArithmeticException ae) {
			System.out.println(3);
		}
		System.out.println(4);
	}
}

public class Ex8_5 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0 / 0); 	 // 예외발생!!
			System.out.println(4);	 // 실행되지 않는다.
		} catch (ArithmeticException ae) {
			ae.printStackTrace(); // 참조변수 ae를 통해,
				   	  // 생성된 ArithmeticException인스턴스에 접근할 수 있다.
			System.out.println("예외메시지 : " + ae.getMessage());
		} // try-catch의 끝
		System.out.println(6);
	} // main 메서드의 끝
}