package kr.ac.kopo.althrithm;

import java.util.Scanner;

public class Main1934 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int gcd = getGCD(A, B); 
			int lcm = (A * B) / gcd; 
			
			System.out.println(lcm);
		}
	}
	
	public static int getGCD(int a, int b) {
	    while(b != 0) {
	        int R = a % b;
	        a = b;
	        b = R;
	    }
	    return a;
	}

}