package Tutorial;

import java.util.Scanner;

public class a16935 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();

		int[][] arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int ans[][] = null;

		for (int tc = 0; tc < R; tc++) {// 연산
			int num = sc.nextInt(); // 연산 번호
			N = arr.length;
			M = arr[1].length;
			switch (num) {
			case 1: // 상하 반전
				ans = new int[arr.length][arr[1].length];
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < M; j++) {
						ans[N - i - 1][j] = arr[i][j];
					}
				}
				break;
			case 2: // 좌우 반전
				ans = new int[arr.length][arr[1].length];
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < M; j++) {
						ans[i][M - j - 1] = arr[i][j];
					}
				}
				break;
			case 3: // 오른쪽으로 90도
				ans = new int[arr[1].length][arr.length];
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < M; j++) {
						ans[j][N - 1 - i] = arr[i][j];
					}
				}
				break;
			case 4: // 왼쪽으로 90도
				ans = new int[arr[1].length][arr.length];
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < M; j++) {
						ans[M - 1 - j][i] = arr[i][j];
					}
				}
				break;
			case 5:
				ans = new int[arr.length][arr[1].length];
				for (int i = 0; i < N / 2; i++) { // 4>1
					for (int j = 0; j < M / 2; j++) {
						ans[i][j + M / 2] = arr[i][j];
					}
				}
				for (int i = 0; i < N / 2; i++) { // 2
					for (int j = M / 2; j < M; j++) {
						ans[N / 2 + i][j] = arr[i][j];
					}
				}
				for (int i = N / 2; i < N; i++) { // 3
					for (int j = M / 2; j < M; j++) {
						ans[i][j - M / 2] = arr[i][j];
					}
				}
				for (int i = N / 2; i < N; i++) { // 4
					for (int j = 0; j < M / 2; j++) {
						ans[i - N / 2][j] = arr[i][j];
					}
				}
				break;
			case 6:
				ans = new int[arr.length][arr[1].length];
				for (int i = 0; i < N / 2; i++) { // 1
					for (int j = 0; j < M / 2; j++) {
						ans[i + N / 2][j] = arr[i][j];
					}
				}
				for (int i = 0; i < N / 2; i++) { // 2
					for (int j = M / 2; j < M; j++) {
						ans[i][j - M / 2] = arr[i][j];
					}
				}
				for (int i = N / 2; i < N; i++) { // 3
					for (int j = M / 2; j < M; j++) {
						ans[i - N / 2][j] = arr[i][j];
					}
				}
				for (int i = N / 2; i < N; i++) { // 4
					for (int j = 0; j < M / 2; j++) {
						ans[i][j + M / 2] = arr[i][j];
					}
				}
				break;

			} // switch
				// 연산을 반복하려면 arr배열에 ans을 넣어줘야한다
			arr = ans;

		}
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
