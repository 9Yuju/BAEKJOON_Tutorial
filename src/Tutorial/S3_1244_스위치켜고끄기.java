package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_1244_스위치켜고끄기 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine()); // 스위치개수
		int[] arr = new int[T];
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int S = Integer.parseInt(bf.readLine()); // 학생수

		for (int i = 0; i < S; i++) {
			StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");
			int gender = Integer.parseInt(st2.nextToken()); // 성별

			int num = Integer.parseInt(st2.nextToken()); // 받은 수 : 3을 받았지만 인덱스는 2

			switch (gender) {
			case 1: // 남학생일때
//				while (true) {
//					if (num > T)
//						break; // 배수가 스위치개수보다 많아지면
//					arr[num - 1] =  arr[num - 1] == 0 ? 1 : 0;
//					num = num * 2;
//				}
				for (int j = 0; j < T; j++) {
					if ((j + 1) % num == 0)
						arr[j] = arr[j] == 0 ? 1 : 0;
				}
				break;
			case 2:// 여학생일때
				arr[num - 1] = (arr[num - 1] == 0) ? 1 : 0;
				for (int j = 0; j < T / 2; j++) {
					if (num - 1 - j < 0 || num - 1 + j >= T)
						break;
					if (arr[num - 1 - j] == arr[num - 1 + j]) {
						arr[num - 1 - j] = arr[num - 1 - j] == 0 ? 1 : 0;
						arr[num - 1 + j] = arr[num - 1 - j];
					} else
						break;
				}

//				int temp = 1;
//				int num2 = num - 1; // 스위치번호랑 인덱스랑 달라서
//				while (true) {
//					arr[num2] = (arr[num2] == 0) ? 1 : 0;
//					if (num2 - temp < 0 || num2 + temp >= T)
//						break; // 범위벗어나면
//					if (arr[num2 - temp] == arr[num2 + temp]) {
//						arr[num2 - temp] = (arr[num2 - temp] == 0) ? 1 : 0;
//						arr[num2 + temp] = arr[num2 - temp];
//						temp++;
//					} else {
//						break;
//					}
//
//				}
				break;

			}

		} // 학생 for
		for (int i = 0; i < T; i++) {
			System.out.print(arr[i] + " ");
			if ((i + 1) % 20 == 0)
				System.out.println();
		}

	}
}
