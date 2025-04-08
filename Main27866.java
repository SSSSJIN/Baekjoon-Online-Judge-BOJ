package kr.ac.kopo.boj;

/*
문제
단어 
S와 정수 
i 가 주어졌을 때, 
S의 
i 번째 글자를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S 가 주어진다. 
단어의 길이는 최대 1,000 이다.

둘째 줄에 정수 i 가 주어진다. 
(1<=i<=|S|)
 */

import java.util.Scanner;

public class Main27866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int i = sc.nextInt();
		
		System.out.println(S.charAt(i-1));
	}
}