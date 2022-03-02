package inClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_2563_색종이 { // 색종이
	static int arr[][] = new int[101][101];

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine()); // 색종이의 수

		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());

			for (int j = X; j < X + 10; j++) {
				for (int j2 = Y; j2 < Y + 10; j2++) {
					arr[j][j2] = 1;
				}
			}

		} // for

		// 검은 영역의 넓이 구하기
		int sum = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int j2 = 0; j2 < arr.length; j2++) {
				sum += arr[j][j2];
			}
		}

		System.out.println(sum);

	}

}
