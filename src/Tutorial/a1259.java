package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class a1259 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> index = new ArrayList<String>();
		while (true) {
			String num = bf.readLine();
			if (num.equals("0"))
				break;
			String[] arr = num.split("");

			switch (arr.length) {
			case 1:
				index.add("yes");
				break;
			case 2:
				if (arr[0].equals(arr[1])) {
					index.add("yes");
				}else index.add("no");
				break;
			case 3:
				if (arr[0].equals(arr[2])) {
					index.add("yes");
				}else index.add("no");
				break;
			case 4:
				if (arr[0].equals(arr[3]) && arr[1].equals(arr[2])) {
					index.add("yes");
				}else index.add("no");
				break;
			case 5:
				if (arr[0].equals(arr[4]) && arr[1].equals(arr[3])) {
					index.add("yes");
				}else index.add("no");
				break;
			default:
				index.add("no");
				break;
			}// switch

		} // while
		for (String str : index) {
			System.out.println(str);
		}

	}

}
