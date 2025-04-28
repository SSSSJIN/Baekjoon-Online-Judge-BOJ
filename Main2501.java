package kr.ac.kopo.althrithm;

import java.util.*;

public class Main2501 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				result.add(i);
			}
		}
		 
		if(K <= result.size()) {
			System.out.println(result.get(K - 1));
		} else {
			System.out.println(0);
		}			
	}
}
