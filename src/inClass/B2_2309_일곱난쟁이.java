package inClass;

import java.util.Arrays;
import java.util.Scanner;

public class B2_2309_일곱난쟁이 { // 일곱난쟁이
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[9];
		int sum = 0; // 9 난쟁이의 합
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		// 오름차순 정렬
		Arrays.sort(num);

		int x = sum - 100;
		int no1 = 0, no2 = 0;

		// 2명의 키의 합이 x면 걔네가 가짜
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] + num[j] == x) {
					no1 = num[i];
					no2 = num[j];
				}
			}
		}
		
		
		// 출력
		for (int s : num) {
			if (s == no1 || s == no2)
				continue;
			System.out.println(s);
		}

	}
}
