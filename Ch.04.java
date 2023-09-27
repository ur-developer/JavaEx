//Ex4_1
public class Ex4_1 {

	public static void main(String[] args) {
		int score = 80;
		
		if (score > 60) {
			System.out.println("합격입니다.");
		}
	}
}

<Console>
합격입니다.

//Ex4_2
public class Ex4_2 {

	public static void main(String[] args) {
		int x = 0;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		x = 1;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
	}
}

<Console>
x=0 일 때, 참인 것은
x==0
!(x!=0)
x=1 일 때, 참인 것은
x!=0
!(x==0)

//Ex4_3
import java.util.Scanner;

public class Ex4_3 {
	public static void main(String[] args) {
		System.out.print("숫자를 하나 입력하세요.>");
		Scanner scanner = new Scanner(System.in);	
		int input = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 input에 저장
	
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else { // input!=인 경우
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
	} //main 끝
}

<Console>
숫자를 하나 입력하세요.>5
입력하신 숫자는 0이 아닙니다.

숫자를 하나 입력하세요.>0
입력하신 숫자는 0입니다.
