import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] temp = emergency.clone();
        Arrays.sort(temp); // 최대값 정렬 정수형 배열
        int[] answer = new int[emergency.length]; // 결과 배열
        int rank = 1; //응급도
        for (int mi=temp.length-1; mi>=0; mi--) { //높은 값부터 시작
            for (int ei=0; ei<emergency.length; ei++) { //emg 배열 전부 순회
                if (temp[mi]==emergency[ei]) { //만약 최대값과 일치하는 배열 발견 시
                    answer[ei]=rank; //결과배열 인덱스에 랭크 추가
                }
            }
            rank++;
        }
        
        return answer;
    }
}