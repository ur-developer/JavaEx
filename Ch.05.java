
//Ex5_1

import java.util.Arrays; // Arrays.toString()을 사용하기 위해 추가

public class Ex5_1 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd', };
		
		for (int i=0; i < iArr1.length ; i++ ) {
			iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다.
		}
	
		for (int i=0; i < iArr2.length ; i++ ) {
			iArr2[i]= (int)(Math.random()*10) + 1; // 1~10의 값을 배열에 저장 
		}
		
		// 배열에 저장된 값들을 출력한다.
		for (int i=0; i < iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	}
}

<Console>
1,2,3,4,5,6,7,8,9,10,
[6, 8, 5, 2, 6, 9, 3, 8, 5, 3]
[100, 95, 80, 70, 60]
[a, b, c, d]
[I@cac736f
abcd


//Ex5_2
public class Ex5_2 {

	public static void main(String[] args) {
		int sum = 0;    	 // 총합을 저장하기 위한 변수
		float average = 0f;  // 평균을 저장하기 위한 변수
	
		int[] score = {100, 88, 100, 100, 90};
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // 반복문을 이용해서 배열에 저장되어 있는 값들을 모두 더한다.
		}
		average = sum / (float)score.length; // 계산결과를 float타입으로 얻으려 형변환
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
	}
}

<Console>
총합 : 478
평균 : 95.6

//Ex5_3
class Ex5_3 {
	public static void main(String[] args) {
	int[] score = { 79, 88, 91, 33, 100, 55, 95};
	
	int max = score[0];  // 배열의 첫 번째 값으로 최대값을 초기화 한다.
	int min = score[0];  // 배열의 첫 번째 값으로 최소값을 초기화 한다.
	
	for(int i=1; i < score.length; i++ ) { // 배열의 두 번째 요소부터 읽기 위해서 변수 i의ㅏ 값을 1로 초기화 했다.
		if(score[i]> max) {
			max = score[i];
		} else if(score[i]< min) {
			min = score[i];
		}
	} // end of for
	
	System.out.println("최대값 :" + max);
	System.out.println("최소값 :" + min);
	} // end of main
} // end of class

<Console>
최대값 :100
최소값 :33

//Ex5_4
import java.util.Arrays;

public class Ex5_4 {
	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for (int i=0; i <100; i++) {
			int n = (int)(Math.random() * 10); // 0~9 중의 한 값을 임의로 얻는다.
			
			// numArr[0] numArr[n]의 값을 서로 바꾼다.
			int tmp  = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp; 
		}
		System.out.println(Arrays.toString(numArr));
	} // main의 끝
}

<Console>
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
[5, 7, 0, 8, 3, 1, 4, 9, 6, 2]

//Ex5_5
public class Ex5_5 {
	public static void main(String[] args) {
		int[] ball = new int[45]; // 45개의 정수값을 젖아하기 위한 배열 생성.
		
		// 배열의 각요소에 1~45의 값을 저장한다.
		for(int i=0; i < ball.length; i++) 
			ball[i]= i+1;  // ball[0]에 1이 저장된다.
		
		int tmp = 0 ; // 두 값을 바꾸는 사용할 임시 변수
		int j = 0 ;   // 임의의 값을 얻어서 저장할 변수
		
		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		// 0번째 부터 5번째 요소까지 모두 6개만 바꾼다.
		for(int i=0; i < 6; i++) {
			j = (int)(Math.random() * 45); // 0~44 범위의 임의의 값을 얻는다.
			// ball[i]와 ball[j]의 값을 서로 바꾼다.
			tmp      = ball[i];
			ball[i]  = ball[j]; 
			ball[j]  = tmp; 
		}
		// 배열 ball의 앞에서 부터 6개의 요소를 출력한다.
		for(int i=0; i < 6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
	}
}

<Console>
ball[0]=29
ball[1]=9
ball[2]=27
ball[3]=24
ball[4]=26
ball[5]=7

//Ex5_6
public class Ex5_6 {

	public static void main(String[] args) {
		String[] names = {"Kim","Park","Yi"};
		
		for(int i=0; i < names.length; i++)
			System.out.println("names["+i+"]:"+names[i]);

		String tmp = names[2]; // 배열 names의 세 번째 요소를 tmp에 저장
		System.out.println("tmp:"+tmp);
		names[0] = "Yu"; // 배열 names의 첫 번째 요소를 "Yu"로 변경
		
		for(int i=0; i < names.length; i++)
			System.out.println(names[i]);
	} // main
}

<Console>
names[0]:Kim
names[1]:Park
names[2]:Yi
tmp:Yi
Yu
Park
Yi

//Ex5_7
public class Ex5_7 {

	public static void main(String[] args) {
		System.out.println("매개변수의 개수:"+args.length);
		  for(int i=0; i< args.length; i++) {
			  System.out.println("args[" + i + "] = \""+ args[i]+ "\"" );
		 }
	}
}

<Console>
매개변수의 개수:0

//Ex5_8
public class Ex5_8 {

	public static void main(String[] args) {
		int[][] score = {
				{ 100, 100, 100 },
				{ 20, 20, 20 },
				{30, 30, 30 },
				{40, 40, 40 }
		  };
		int sum = 0;   
	
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
			
				sum += score[i][j];
			}
		}
		System.out.println("sum=" + sum);
	}
}

<Console>
score[0][1]=100
score[0][2]=100
score[1][0]=20
score[1][1]=20
score[1][2]=20
score[2][0]=30
score[2][1]=30
score[2][2]=30
score[3][0]=40
score[3][1]=40
score[3][2]=40
sum=570

//Ex5_9
public class Ex5_9 {

	public static void main(String[] args) {
		int[][] score = {
				{ 100, 100, 100 },
				{ 20, 20, 20 },
				{ 30, 30, 30 },
				{ 40, 40, 40 },
				{ 50, 50, 50 }
			};
	// 과목별 총점
		int korTotal = 0 , engTotal = 0, mathTotal = 0;
	
		System.out.println(" 번호  국어  영어  수학  총점  평균");
		System.out.println("===============================");
		
		for (int i= 0; i < score.length; i++) {
			int sum = 0;	  // 개인별 총점
			float avg = 0.0f; // 개인별 평균
			
			korTotal  += score[i][0];
			engTotal  += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i+1);
			
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);			
			}
			
			avg = sum/(float)score[i].length; // 평균계산
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		
		System.out.println("===============================");
		System.out.printf("총점 : %3d %4d %4d%n", korTotal, engTotal, mathTotal);
	}
}

<Console>
 번호  국어  영어  수학  총점  평균
=============================
  1  100  100  100  300 100.0
  2   20   20   20   60  20.0
  3   30   30   30   90  30.0
  4   40   40   40  120  40.0
  5   50   50   50  150  50.0
=============================
총점 : 240  240  240

//Ex5_10
import java.util.Scanner;

public class Ex5_10 {

	public static void main(String[] args) {
		String[][] words = {
				{"chair","의자"},	   // words[0][0], words[0][1]
				{"computer", "컴퓨터"},  // words[1][0], words[1][1]
				{"integer", "정수"}     // words[2][0], words[2][1]
		};
		
		Scanner scanner =  new Scanner(System.in);
		
		for(int i=0; i < words.length; i++ ) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
		
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);
			}
		}  // for
	} // main의 끝
}

<Console>
Q1. chair의 뜻은? 의자
틀렸습니다. 정답은 의자입니다. 

Q2. computer의 뜻은?컴퓨터
정답입니다.

Q3. integer의 뜻은?정수
정답입니다.

//Ex Exercise5_2
public class Exercise5_2{

	public static void main(String[] args) {
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10, 10, 10},
				{20, 20, 20, 20},
				{ 30, 30}
		};
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		System.out.println(arr[3].length);
	}	
}

<Console>
5
3
4
2

arr[3].length = 2

// Exercise5_3
public class Exercise5_3 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		
		for(int i = 0;  i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum=" + sum);
	}
}

<Console>
sum=150

Exercise5_4
public class Exercise5_4 {

	public static void main(String[] args) {
		int[][] arr = {
				{ 5, 5, 5, 5, 5 },
				{ 10, 10, 10, 10, 10 },
				{ 20, 20, 20, 20, 20 },
				{ 30, 30, 30, 30, 30 }
		};

		int total = 0;
		float average = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		
		average = total / (float)(arr.length * arr[0].length);
		System.out.println("total=" + total);
		System.out.println("average=" + average);
	} // end of main
} // end of class

<Console>
total=325
average=16.25
