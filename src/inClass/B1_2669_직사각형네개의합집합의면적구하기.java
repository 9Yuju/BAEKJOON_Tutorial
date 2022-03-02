package inClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_2669_직사각형네개의합집합의면적구하기 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
		int [][]arr = new int[101][101];
		

		for (int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());

			for (int j = x1; j < x2; j++) {
				for (int j2 = y1; j2 < y2; j2++) {
					arr[j][j2] = 1;
				}
			}

		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1)
					sum++;
			}
		}

		System.out.println(sum);

	}
}
