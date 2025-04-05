package kr.ac.kopo.programmers;

/*
 문제 설명
최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.

제한사항
0 < array의 길이 < 100
0 ≤ array의 원소 < 1000
입출력 예
array	result
[1, 2, 3, 3, 3, 4]	3
[1, 1, 2, 2]	-1
[1]	1
입출력 예 설명
입출력 예 #1

[1, 2, 3, 3, 3, 4]에서 1은 1개 2는 1개 3은 3개 4는 1개로 최빈값은 3입니다.
입출력 예 #2

[1, 1, 2, 2]에서 1은 2개 2는 2개로 최빈값이 1, 2입니다. 최빈값이 여러 개이므로 -1을 return 합니다.
입출력 예 #3

[1]에는 1만 있으므로 최빈값은 1입니다.

 */

// gpt 답 물어서 찾은거. 다시 풀고 다시 물어보고 다시 써보기. 

import java.util.HashMap;

public class Mode {
    public static int solution(int[] array) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : array) {
            if (countMap.containsKey(num)) {
                int count = countMap.get(num);
                countMap.put(num, count + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        int maxCount = 0;
        for (int count : countMap.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        int mode = -1;
        int maxCountNum = 0;

        for (int key : countMap.keySet()) {
            if (countMap.get(key) == maxCount) {
                maxCountNum++;
                mode = key;
            }
        }

        if (maxCountNum > 1) {
            return -1;
        } else {
            return mode;
        }
    }
}