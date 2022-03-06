package inClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S4_10157_자리배정 { // swea 달팽이 숫자랑 비슷 
	// 하 > 우 > 상 > 좌
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int C = Integer.parseInt(st.nextToken()); // 가로
		int R = Integer.parseInt(st.nextToken()); // 세로
		int K = Integer.parseInt(bf.readLine()); // 대기번호

		int[][] arr = new int[R + 1][C + 1]; // 0,0 은 안쓸거라서

		int x = 1, y = 1; // 초기위치 (1,1)
		int fw = 0; // 방향 0하 1우 2상 3좌
		int xx = 0, yy = 0;
		if (K > C * R) {
			System.out.println(0);
		} else {
			for (int i = 1; i <= K; i++) {
				arr[x][y] = i;
				int X = x + dx[fw];
				int Y = y + dy[fw];
				xx = x;
				yy = y;

				// 이미 값이 들어가있거나(0이아니거나) 배열범위를 벗어나면 방향을 바꿔주기
				if (X < 1 || Y < 1 || X > R || Y > C || (arr[X][Y] != 0)) {
					fw = (fw + 1) % 4;

					x += dx[fw];
					y += dy[fw];

				} else {
					x += dx[fw];
					y += dy[fw];
				}

			} // for
//
//			for (int[] is : arr) {
//				for (int is2 : is) {
//					System.out.print(is2 + " ");
//				}
//				System.out.println();
//			}

			System.out.println(yy + " " + xx);

		}
	}

}
