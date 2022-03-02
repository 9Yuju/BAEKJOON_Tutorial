package inClass;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class B2_2605_줄세우기 { //줄 세우기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			int x = sc.nextInt();
			list.add(list.size() - x, i);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
