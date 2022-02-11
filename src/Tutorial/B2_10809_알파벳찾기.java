package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String S = bf.readLine();
		StringBuilder sb = new StringBuilder();

		for (int j = 97; j < 123; j++) { // 소문자만큼 반복
			char c = (char) j;

			int index = 0;
			for (int i = 0; i < S.length(); i++) {
				String str = String.valueOf(c);

				if (S.contains(str) == true) {
					index = S.indexOf(str);
				} else
					index = -1;

			}
			sb.append(index).append(" ");

		} // for
		System.out.println(sb);

	}
}
