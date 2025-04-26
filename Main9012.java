package kr.ac.kopo.althrithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		int T = Integer.parseInt(br.readLine());	
		
		for(int i = 0; i < T; i++) {
			String ps = br.readLine();
			if(isVPS(ps)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}	
	}
	
	public static boolean isVPS(String ps) {
		Stack<Character> stack = new Stack<>();
		
		for(char ch : ps.toCharArray()) {
			if(ch == '(') {
				stack.push(ch);
			} else if(ch == ')') {
				if(stack.isEmpty()) {
					return false;
				} else {
				stack.pop();
				}
			}
		}
		return stack.isEmpty();	
	}
}	

