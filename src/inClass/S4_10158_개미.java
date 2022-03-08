package inClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S4_10158_개미 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int w = Integer.parseInt(st.nextToken()); // 너비 6
		int h = Integer.parseInt(st.nextToken()); // 높이 4
		StringTokenizer st1 = new StringTokenizer(bf.readLine());
		int p = Integer.parseInt(st1.nextToken());
		int q = Integer.parseInt(st1.nextToken()); // (p,q)
		int t = Integer.parseInt(bf.readLine()); // 움직일 시간

		int dx = 1, dy = 1; // 초기 움직임
		for (int i = 0; i < t; i++) {

			if (p == 0 | p == w) { // p좌표가 왼쪽이나 오른쪽 벽에 닿을 경우 > dx 반전
				dx = dx * -1;
			}
			if (q == 0 | q == h) { // q좌표가 위나 아래 벽에 닿을 경우 > dy 반전
				dy = dy * -1;
			}
			p = p + dx;
			q = q + dy;
			 System.out.println(i + 1 + " : " + p + " " + q);

		} // for

		System.out.println(p + " " + q);

	}
}
