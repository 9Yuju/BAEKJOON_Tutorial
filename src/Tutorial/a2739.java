package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a2739 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(bf.readLine());
		for (int j = 1; j < 10; j++) {
			System.out.println(i + " * " + j + " = " + i * j);
		}

	}
}
