package kr.ac.kopo.althrithm;

import java.util.Scanner;

public class Main5086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A == 0 && B == 0) {
				break; // 0 0 종료
			}
			
			if(B % A == 0) { // 약수
				System.out.println("factor");
			} else if(A % B == 0) { // 배수
				System.out.println("multiple");
			} else { // 둘다 아니면
				System.out.println("neither");
			}
		}
	}
}