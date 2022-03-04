package inClass;

import java.util.ArrayList;
import java.util.Scanner;

public class S5_2635_수이어가기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		 ArrayList<Integer> maxlist = new ArrayList<Integer>(); // 최대일때 저장용

		int max = 0;

		for (int i = 1; i <= N; i++) {
			 ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(N);
			list.add(i);

			int prepre = N;
			int pre = i;

			while (true) {
				int temp = prepre - pre;
				if (temp >= 0) { // 양수면
					list.add(temp);
				} else
					break;
				//
				prepre = pre;
				pre = temp;

			}
			// i에서 넣을 수 있는 수를 모두 넣고 난 후
			if (max < list.size()) { // 최대보다 크면
				max = list.size();
				maxlist = list; // 리스트도 복사
			}

		} // for

		// 출력
		System.out.println(max);
		for (int i = 0; i < maxlist.size(); i++) {
			System.out.print(maxlist.get(i) + " ");
		}

	}
}
