package kr.ac.kopo.althrithm;

import java.util.Scanner;

public class Main1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if(isPrimeNumner(num)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

	public static boolean isPrimeNumner(int N) {
		if(N == 1) return false;
		if(N == 2) return true;
		
		for(int i = 2; i < N; i++) {
			if(N % i == 0) return false;
		}
		return true;
	}
}