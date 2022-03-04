package imTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S4_12927_배수스위치 { // 배수 스위치 / 문제 함정 : -1을 출력할 상황이 없음 
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String[] arr = new String[str.length() + 1];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = String.valueOf(str.charAt(i - 1));
		}
		int count = 0; // 스위치 누른 횟수

		for (int i = 1; i < arr.length; i++) {
			int k = 1; // 배수
			if (arr[i].equals("Y")) { // 켜져있다면
				count++;
				while (i * k < arr.length) {
					arr[i * k] = arr[i * k].equals("Y") ? "N" : "Y";
					k++;
				}
			}

		} // for

		// 안꺼진거 있는지 확인해서 다꺼지면 count 출력 아니면 -1
		boolean isAll = false;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].equals("Y")) { // 안꺼진게 있나?
				isAll = false;
				break;
			} else
				isAll = true;
		}
		if (isAll = true) {
			System.out.println(count);
		} else {
			System.out.println("-1");
		}

	}
}