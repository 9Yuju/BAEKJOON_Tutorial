package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a2439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		bf.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.printf(" ");
			}
			for (int j = 1; j < i+1; j++) {
				System.out.printf("*");
				
			}
			System.out.println();
		}
	}
}
