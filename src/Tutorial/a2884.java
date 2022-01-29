package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a2884 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int H = Integer.parseInt(st.nextToken()); // 시간
		int M = Integer.parseInt(st.nextToken());
		bf.close();
		int time = (H * 60) + M - 45;

		if (time < 0)
			time += 1440;
		else if (time > 1439)
			time -= 1440;

		System.out.println(time / 60 + " " + time % 60);
	}
}
