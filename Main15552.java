package kr.ac.kopo.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			String[] parts = br.readLine().split(" ");
			int A = Integer.parseInt(parts[0]);
			int B = Integer.parseInt(parts[1]);
			
			bw.write((A + B) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
