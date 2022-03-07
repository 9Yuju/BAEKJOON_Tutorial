package inClass;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1873 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine()); // 테스트케이스의 수
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			String[][] arr = new String[H][W];
			for (int i = 0; i < H; i++) {
				arr[i] = bf.readLine().split("");
			}

			// 전차 시작 위치 파악 & 바라보는 방향 파악
			int x = 0, y = 0;
			int fw = 0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (arr[i][j].equals("^") | arr[i][j].equals("v") | arr[i][j].equals("<") | arr[i][j].equals(">")) {
						x = i;
						y = j;
					}
					switch (arr[i][j]) {
					case "^":
						fw = 1;
						break;
					case "v":
						fw = 2;
						break;
					case "<":
						fw = 3;
						break;
					case ">":
						fw = 4;
						break;
					default:
						break;
					}
				}
			}

			// 입력 처리
			int N = Integer.parseInt(bf.readLine()); // 입력개수
			String[] input = bf.readLine().split("");

			for (int i = 0; i < N; i++) {
				int temp = 0; // S일때 사용
				switch (input[i]) {
				case "U":
					fw = 1;
					arr[x][y] = "^";
					if (x > 0 && arr[x - 1][y].equals(".")) { // 평지라면
						arr[x - 1][y] = arr[x][y];
						arr[x][y] = ".";
						x = x - 1;
					}
					break;
				case "D":
					fw = 2;
					arr[x][y] = "v";
					if (x < H - 1 && arr[x + 1][y].equals(".")) {
						arr[x + 1][y] = arr[x][y];
						arr[x][y] = ".";
						x = x + 1;
					}
					break;
				case "L":
					fw = 3;
					arr[x][y] = "<";
					if (y > 0 && arr[x][y - 1].equals(".")) {
						arr[x][y - 1] = arr[x][y];
						arr[x][y] = ".";
						y = y - 1;
					}
					break;
				case "R":
					fw = 4;
					arr[x][y] = ">";
					if (y < W - 1 && arr[x][y + 1].equals(".")) {
						arr[x][y + 1] = arr[x][y];
						arr[x][y] = ".";
						y = y + 1;
					}
					break;
				case "S":
					switch (fw) { // 1위 2아래 3왼쪽 4오른쪽
					case 1: // 위
						// x-1부터 x-2,x-3,,,, 까지 쭈욱.
						temp = x - 1; // 값복사해놓고
						while (true) {
							if (temp < 0 || arr[temp][y].equals("#"))
								break;
							// *가 있어서 부숴지면 break
							if (arr[temp][y].equals("*")) {
								arr[temp][y] = ".";
								break;
							}
							temp--;
						}

						break;
					case 2: // 아래
						temp = x + 1;
						while (true) {
							if (temp >= H || arr[temp][y].equals("#"))
								break;
							if (arr[temp][y].equals("*")) {
								arr[temp][y] = ".";
								break;
							}
							temp++;
						}
						break;
					case 3: // 왼쪽
						temp = y - 1;
						while (true) {
							if (temp < 0 || arr[x][temp].equals("#"))
								break;
							if (arr[x][temp].equals("*")) {
								arr[x][temp] = ".";
								break;
							}
							temp--;
						}
						break;
					case 4: // 오른쪽
						temp = y + 1;
						while (true) {
							if (temp >= W || arr[x][temp].equals("#"))
								break;
							if (arr[x][temp].equals("*")) {
								arr[x][temp] = ".";
								break;
							}
							temp++;
						}
						break;

					}
					break;

				}// switch
			}

			// 출력
			System.out.printf("#%d ", tc + 1);
			for (String[] strings : arr) {
				for (String strings2 : strings) {
					System.out.print(strings2);
				}
				System.out.println();
			}

		} // for

	}

}
