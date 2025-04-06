package kr.ac.kopo.boj;
/*
 문제
두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A-B를 출력한다.
 */
import java.util.Scanner;

public class Main1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();	int B = sc.nextInt();	
		double answer = (double)A/B; // 형변환을 변수로 충족시키고 A, B를 강제형변환 시켜서 푼다.
		System.out.println(answer);
	}
}
