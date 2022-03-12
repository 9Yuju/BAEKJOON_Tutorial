package inClass;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s5215 {
	static int N, L, max;
	static int[][] material;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			N = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
			
			material = new int[N][2];
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st1 = new StringTokenizer(bf.readLine());
				material[i][0] = Integer.parseInt(st1.nextToken());
				material[i][1] = Integer.parseInt(st1.nextToken());
			}
			
			max = 0;
			diet(0,0,0);
			
			System.out.println("#"+tc+" "+max);
			
			
			
		}//for
		
			
	}

	public static void diet(int cnt, int scr, int cal) {
		if (cal > L)
			return;
		if (cal <= L)
			max = Math.max(max, scr);
		if (cnt == N)
			return;

		diet(cnt + 1, scr + material[cnt][0], cal + material[cnt][1]);
		diet(cnt + 1, scr, cal);

	}
}
