package inClass;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_1954_달팽이숫자 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(bf.readLine());
		// 우 > 하 > 좌 > 상 순서
		int[] dx = { 0, 1, 0, -1 };
		int[] dy = { 1, 0, -1, 0 };

		for (int i = 1; i <= T; i++) { // 테스트케이스동안

			int N = Integer.parseInt(bf.readLine());
			int[][] arr = new int[N][N];
			int x = 0, y = 0; // 시작위치를 0,0으로 잡아주기
			int fw = 0; // dx, dy에 들어갈 방향. 0이면 우 / 1이면 하 / 2면 좌 / 3이면 상

			for (int j = 0; j < N * N; j++) { // 총 N * N번 반복
				// 값은 j+1을 넣어주면된다.
				arr[x][y] = (j + 1);
				int X = x + dx[fw];
				int Y = y + dy[fw];

				// 이미 값이 들어가있거나(0이아니거나) 배열범위를 벗어나면 방향을 바꿔주기
				if (X < 0 || Y < 0 || X >= N || Y >= N || (arr[X][Y] != 0)) {
					fw = (fw + 1) % 4;

					x += dx[fw];
					y += dy[fw];

				} else {
					x += dx[fw];
					y += dy[fw];
				}

			}
			// 출력
			
			sb.append(String.format("#%d", i)).append("\n");
			
//			System.out.printf("#%d", i);
//			System.out.println();
//
			for (int j = 0; j < N; j++) {
				for (int j2 = 0; j2 < N; j2++) {
					//System.out.print(arr[j][j2] + " ");
					sb.append(arr[j][j2]).append(" ");
				}
				//System.out.println();
				sb.append("\n");
			}

		} // for
		System.out.println(sb);
	}
}
