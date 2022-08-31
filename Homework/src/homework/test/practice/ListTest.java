package homework.test.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ListTest {

	public static void main(String[] agrs) {

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();

		list.add("홍길동");
		list.add("김미영");
		list.add("김길동");
		list.add("남상미");
		list.add("강두기");

		System.out.print("이름입력 : ");
		String input = sc.next();

		boolean flag = true;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(input)) {
				System.out.println(i + "번째 인덱스에 존재합니다.");
				flag = false;
			}
		}
		if (flag) {
			System.out.println("입력한 회원이 존재하지 않습니다.");
		}

	}

}
