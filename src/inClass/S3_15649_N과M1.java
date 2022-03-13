package inClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_15649_N과M1 {

	public static int[] arr;
	public static boolean[] isSelected;
	public static StringBuilder sb = new StringBuilder();

	public static void nAm(int N, int M, int cnt) {
		if (cnt == M) {
			for (int i : arr) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;

		}

		for (int i = 0; i < N; i++) {
			if (isSelected[i] == false) {
				isSelected[i] = true;
				arr[cnt] = i + 1;
				nAm(N, M, cnt + 1);
				isSelected[i] = false;
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		arr = new int[M];
		isSelected = new boolean[N];
		nAm(N, M, 0);
		System.out.println(sb);
	}
}
