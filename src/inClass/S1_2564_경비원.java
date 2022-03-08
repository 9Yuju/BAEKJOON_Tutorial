package inClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_2564_경비원 { 1// 경비원 완전다시생각해야함 
	

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int A = Integer.parseInt(st.nextToken()); // 10
		int B = Integer.parseInt(st.nextToken()); // 5

		int S = Integer.parseInt(bf.readLine()); // 상점의 개수
		// 상점 위치 입력
		int store[][] = new int[S][S];
		for (int i = 0; i < S; i++) {
			StringTokenizer st1 = new StringTokenizer(bf.readLine());
			store[i][0] = Integer.parseInt(st1.nextToken()); // 상점 위치 첫째 수 // 1 북 2 남 3 서 4 동
			store[i][1] = Integer.parseInt(st1.nextToken()); // 두번째 수
		}
		// 경비원 위치 입력
		StringTokenizer st2 = new StringTokenizer(bf.readLine());
		int dx = Integer.parseInt(st2.nextToken());
		int dy = Integer.parseInt(st2.nextToken());
		switch (dx) {
		case 1: // 북
			// (0,b)
			dx = 0;
			break;
		case 2: // 남
			// (x,b)
			dx = B;
			break;
		case 3: // 서
			// (b,0)
			dx = dy;
			dy = 0;
			break;
		case 4: // 동
			// (b,y)
			dx = dy;
			dy = A;
			break;
		}
		System.out.println("dx : " + dx + ", dy : " + dy);

		int sum = 0;
		int x = 0, y = 0;
		// 거리 계산
		for (int i = 0; i < S; i++) {
			int distance = 0;

			switch (store[i][0]) {
			case 1: // 북
				// (0,b)
				x = 0;
				y = store[i][1];
				break;
			case 2: // 남
				// (x,b)
				x = B;
				y = store[i][1];
				break;
			case 3: // 서
				// (b,0)
				x = store[i][1];
				y = 0;
				break;
			case 4: // 동
				// (b,y)
				x = store[i][1];
				y = A;
				break;
			}
			if (dx == 0 | dx == B) { // 경비원이 북쪽, 남쪽에 위치할 경우
				distance = Math.abs(dx - x) + y + dy;
			} else {// 동쪽, 서쪽에 위치할 경우
				distance = Math.abs(dy - y) + x + dx;
			}
			// 상점과 경비원이 같은 선상에 위치할 경우
			if (dx == x) {
				distance = Math.abs(dy - y);
			} else if (dy == y) {
				distance = Math.abs(dx - x);
			}

			// 최소 거리 찾기
			if (distance > (A + B)) {
				distance = (2 * (A + B)) - distance;
			}

			sum += distance;
			System.out.println("(" + x + "," + y + ")");
			System.out.println((i + 1) + "번째 : " + distance);

		} // for
		System.out.println(sum);
	}

}
