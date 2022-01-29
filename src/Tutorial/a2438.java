package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a2438 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
