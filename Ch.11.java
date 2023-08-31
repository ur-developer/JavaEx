//Ex11_1

public class Ex11_1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);

		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);

		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);

		list2.set(3, "AA");
		print(list1, list2);

		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));

		print(list1, list2);

		for (int i = list2.size() - 1; i >= 0; i--) {
			if (list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:" + list1);
		System.out.println("list2:" + list2);
		System.out.println();
	}
}

<Console>

list1:[5, 4, 2, 0, 1, 3]
list2:[4, 2, 0]

list1:[0, 1, 2, 3, 4, 5]
list2:[0, 2, 4]

list1.containsAll(list2):true
list1:[0, 1, 2, 3, 4, 5]
list2:[0, 2, 4, A, B, C]

list1:[0, 1, 2, 3, 4, 5]
list2:[0, 2, 4, AA, B, C]

list1.retainAll(list2):true
list1:[0, 2, 4]
list2:[0, 2, 4, AA, B, C]

list1:[0, 2, 4]
list2:[AA, B, C]


//Ex11_2

public class Ex11_2 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); // Queue인터페이스의 구현체인 LinkedList를 사용

		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0");
		q.offer("1");
		q.offer("2");

		System.out.println("= Stack =");
		while (!st.empty()) {
			System.out.println(st.pop()); // 스택에서 요소를 하나를 꺼내서 출력
		}

		System.out.println("= Queue =");
		while (!q.isEmpty()) {
			System.out.println(q.poll()); // 큐에서 요소를 하나를 꺼내서 출력
		}
	}
}

<Console>
= Stack =
2
1
0
= Queue =
0
1
2

//Ex11_3
public class Ex11_3 {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage:java Ex11_3 \"EXPRESSION\"");
			System.out.println("Example:java Ex11_3 \"((2+3)*1)+3\"");
			System.exit(0);
		}

		Stack st = new Stack();
		String expression = args[0];

		System.out.println("expression:" + expression);

		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				if (ch == '(') {
					st.push(ch + "");
				} else if (ch == ')') {
					st.pop();
				}
			}

			if (st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
		}
	}
}

<Console>
Usage:java Ex11_3 "EXPRESSION"
Example:java Ex11_3 "((2+3)*1)+3"

//Ex11_4
public class Ex11_4 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장되도록 한다.

	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

		while (true) {
			System.out.println(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();

				if ("".equals(input))
					continue;

				if (input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					// 입력받은 명령어를 저장하고,
					save(input);

					// LinkedList의 내용을 보여준다.
					LinkedList tmp = (LinkedList) q;
					ListIterator it = tmp.listIterator();

					while (it.hasNext())
						System.out.println(++i + "." + it.next());
				} else {
					save(input);
					System.out.println(input);
				} // if(input.equalsIgnoreCase("q")) {
			} catch (Exception e) {
				System.out.println("입력오류입니다.");
			}
		} // while(true)
	}// main

	public static void save(String input) {
		// queue에 저장한다.
		if (!"".equals(input))
			q.offer(input);
		// queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
		if (q.size() > MAX_SIZE) // size()는 Collection인터페이스에 정의
			q.remove();
	}
} // end of class

<Console>
help를 입력하면 도움말을 볼 수 있습니다.
>>
help
 help - 도움말을 보여줍니다.
 q 또는 Q - 프로그램을 종료합니다.
 history - 최근에 입력한 명령어를 5개 보여줍니다.
>>
dir
dir
>>
cd
cd
>>
mkdir
mkdir
>>
dir
dir
>>
history
1.dir
2.cd
3.mkdir
4.dir
5.history
>>
q
