package study;

import java.util.Scanner;

public class S5_2609_최대공약수와최소공배수 { // 최대공약수와 최소공배수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int N = (A > B) ? B : A;
		// 최대 공약수
		while (!((A % N == 0) & (B % N == 0))) {
			N--;
		}
		System.out.println(N);

		// 최소 공배수
		N = (A > B) ? B : A;
		int T = (A < B) ? B : A;
		int x = 1;
		while (true) {
			if ((N * x) % T == 0) {
				System.out.println(N * x);
				break;
			}
			x++;
		}

	}

}
