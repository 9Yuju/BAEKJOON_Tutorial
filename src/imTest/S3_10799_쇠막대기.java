package imTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S3_10799_쇠막대기 { // 다 지우고 스택으로 한번
	
	static int sum = 0;
	static char [] arr;
	static int count=0;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		arr = bf.readLine().toCharArray();
		
		//확인용
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]=='(') {
				count++;
			}else {
				count--;
				if(arr[i-1]=='(') {
					sum = sum + count;
				}else {
					
				}
			}
			
			
		}//for
		

		System.out.println(sum);
		
	}
	
	
	
}















