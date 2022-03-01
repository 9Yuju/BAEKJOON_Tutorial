package imTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_10250_ACM호텔 { // ACM 호텔

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine()); // 테스트 케이스

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int H = Integer.parseInt(st.nextToken()); // 높이
			int W = Integer.parseInt(st.nextToken()); // 너비 < 안쓰임
			int N = Integer.parseInt(st.nextToken()); // n번째 손님
	
			int Y = N % H ;// 층수
			int X = N / H + 1;
			if (N % H == 0) { // N이 H의 배수일경우 
				Y = H;
				X--;
			}

			System.out.println(Y*100+X);

		} // for

	}

}
