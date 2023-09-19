
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


//ArrayEx5
public class ArrayEx5 {

	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;

		int[] score = { 100, 88, 100, 100, 90 };
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		average = sum / (float) score.length;

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	}
}

//ArrayEx6
public class ArrayEx6 {
	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0];
		int min = score[0];

		for (int i = 1; i < score.length; i++)
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
	}
}

//ArrayEx12
public class ArrayEx12 {
	public static void main(String[] args) {
		String[] names = { "Kim", "Park", "Yi" };

		for (int i = 0; i < names.length; i++)
			System.out.println("names[" + i + "]: " + names[i]);

		String tmp = names[2];
		System.out.println("tmp:" + tmp);
		names[0] = "Yu";

		for (String str : names)
			System.out.println(str);
	}
}

ArrayEx14
public class ArrayEx14 {

	public static void main(String[] args) {
		String src = "ABCDE";

		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt(" + i + "):" + ch);
		}
		char[] chArr = src.toCharArray();
		System.out.println(chArr);
	}
}
