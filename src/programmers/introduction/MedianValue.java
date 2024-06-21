package programmers.introduction;

import java.util.Arrays;


// https://school.programmers.co.kr/learn/courses/30/lessons/120811?language=java
public class MedianValue {
    // 중앙값 구하기

    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }

}
