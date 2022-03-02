package imTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_2999_비밀이메일 { // 비밀 이메일
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int N = str.length();

		// R, C값 구하기
		int R = 1, C = 1;
		for (int c = 1; c <= N; c++) { // c
			for (int r = 1; r <= c; r++) { // r
				if (c * r == N) {
					if (R <= r) { // R은 최대한 커야
						R = r;
						C = c;
					}
				}
			}
		}

		// 입력 열>행
		char[][] arr = new char[R][C];
		int index = 0;
		for (int i = 0; i < C; i++) {
			for (int j = 0; j < R; j++) {
				arr[j][i] = str.charAt(index);
				index++;
			}
		}

		// 출력 행>열
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print(arr[i][j]);
			}
		}

	}

}
