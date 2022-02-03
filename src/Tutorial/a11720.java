package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a11720 {
	public static void main(String[] args) throws  IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		String []s = (bf.readLine()).split("");
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += Integer.parseInt(s[i]);
		}
		System.out.println(sum);
	}
}
