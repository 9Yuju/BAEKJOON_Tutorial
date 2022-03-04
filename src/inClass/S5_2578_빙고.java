package inClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_2578_빙고 { // 빙고 실5
	static int[][] bingo = new int[5][5];
	static int[][] arr = new int[5][5]; // 사회자

	static int line;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// 빙고판 입력
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			for (int j = 0; j < 5; j++) {
				bingo[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// 사회자 입력
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			for (int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int count = 0;
		loop: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int temp = arr[i][j];
				count++;
				for (int x = 0; x < 5; x++) {
					for (int y = 0; y < 5; y++) {
						if (bingo[x][y] == temp) {

							bingo[x][y] = -1; // 해당하는 곳을 -1로 변경
							// 빙고인지 확인
							if (isBingo()) {
								break loop;
							}

						}

					}
				}

			}
		}

		System.out.println(count);

	}

	public static boolean isBingo() {
		// bingo 배열
		line = 0;
		int score = 0;
		// 오른쪽 밑 오른쪽아래 왼쪽아래 만 생각하면 된다.

		// 오른쪽
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (bingo[i][j] == -1) {
					score++;
				}
			}
			if (score == 5)
				line++;
			score = 0;
		}
		// 아래
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (bingo[j][i] == -1) {
					score++;
				}
			}
			if (score == 5)
				line++;
			score = 0;
		}
		// 오른쪽 아래
		for (int i = 0; i < 5; i++) {
			if (bingo[i][i] == -1)
				score++;

		}
		if (score == 5)
			line++;
		score = 0;

		// 왼쪽 아래
		for (int i = 0; i < 5; i++) {
			if (bingo[i][4 - i] == -1)
				score++;
		}
		if (score == 5)
			line++;
		score = 0;

		if (line >= 3) {
			return true;
		} else {
			return false;
		}

	}

}
