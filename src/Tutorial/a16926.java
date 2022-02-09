package Tutorial;

import java.util.Scanner;

public class a16926 {

	public static void main(String[] args) {
		int[][] delta = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } }; // 우 하 좌 상 

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		// 입력
		int[][] arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// 돌리기
		int T = Math.min(N, M) / 2;

		for (int i = 0; i < R; i++) { // 회전 횟수

			for (int j = 0; j < T; j++) { // 몇개를 돌리는지
				int x = j;
				int y = j;

				int temp = arr[x][y]; // 제일 첫칸 임시값에 넣기

				int fw = 0; // 방향값

				while (fw < 4) {
					int X = x + delta[fw][0];
					int Y = y + delta[fw][1];

					if (X >= j && Y >= j && X < N - j && Y < M - j) {
						arr[x][y] = arr[X][Y];
						x = X;
						y = Y;
					} else
						fw++;
				}

				arr[j + 1][j] = temp; // 다 돌아가면 빼놓은거 넣기

//				for (int j2 = 0; j2 < delta.length; j2++) { // 왼 위 오 아래
//					int temp = arr[x][y]; // 제일 첫칸 임시값에 넣기
//					int X = x + delta[j2][0];
//					int Y = y + delta[j2][1];
//
//					while (true) { // 범위 내에 있는동안 계속 반복
//						X = X + delta[j2][0];
//						Y = Y + delta[j2][1];
//						System.out.println("X의 값 : " + X + ", Y의 값 : " + Y);
//
//						if (X >= x & Y >= y & X < N - x & Y < M - y) {
//							arr[X - delta[j2][0]][Y - delta[j2][1]] = arr[X][Y];
//							System.out.println(arr[X][Y]);
//						} else
//							break;
//
//					}
//
//					arr[x + 1][y] = temp; // 다 돌아가면 빼놓은거 넣기

			}
		} // R for

		// 출력
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}

	}

}
