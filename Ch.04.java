//FlowEx1
public class FlowEx1 {

	public static void main(String[] args) {

		int x = 0;
		System.out.printf("x=%d 일때, 참인 것은 %n", x);

		if (x == 0)
			System.out.println("x==0");
		if (x != 0)
			System.out.println("x!=0");
		if (!(x == 0))
			System.out.println("!(x==0)");
		if (!(x != 0))
			System.out.println("!(x!=0)");

		x = 1;
		System.out.printf("x=%d 일때, 참인 것은 %n", x);

		if (x == 0)
			System.out.println("x==0");
		if (x != 0)
			System.out.println("x!=0");
		if (!(x == 0))
			System.out.println("!(x==0)");
		if (!(x != 0))
			System.out.println("!(x!=0)");
	}
}

//FlowEx4
public class FlowEx4 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';

		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}
}

//FlowEx5
import java.util.Scanner;

public class FlowEx5 {
	public static void main(String[] args) {

		int score = 0;
		char grade = ' ', opt = '0';

		System.out.print("점수를 입력해주세요.>");

		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();

		System.out.printf("당신의 점수는 %d입니다.%n", score);

		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
	}
}

//FlowEx7
import java.util.Scanner;

public class FlowEx7 {
	public static void main(String[] args) {
		System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int) (Math.random() * 3) + 1;

		System.out.println("당신은 " + user + "입니다.");
		System.out.println("컴은 " + com + "입니다.");

		switch (user - com) {
		case 2:
		case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1:
		case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break;
		}
	}
}

//FlowEx12
public class FlowEx12 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);

		for (int i = 1; i <= 5; i++)
			System.out.print(i);

		System.out.println();
	}
}

//FlowEx29
public class FlowEx29 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.printf("i=%d ", i);

			int tmp = i;

			do {
				if (tmp % 10 % 3 == 0 && tmp % 10 != 0)
					System.out.print("짝");
			} while ((tmp /= 10) != 0);

			System.out.println();
		}
	}
}

//FlowEx30
public class FlowEx30 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		while (true) {
			if (sum > 100)
				break;
			++i;
			sum += i;
		}
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}
}

//FlowEx31
public class FlowEx31 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0)
				continue;
			System.out.println(i);
		}
	}
}

//FlowEx33
public class FlowEx33 {

	public static void main(String[] args) {

		Loop1: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5)
					break Loop1;
//				break;
//				continue Loop1;
//				continue;
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
	}
}