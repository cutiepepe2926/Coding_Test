import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        // 귤 크기별 개수 세기
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }

        // 개수만 뽑아서 내림차순 정렬
        ArrayList<Integer> countList = new ArrayList<>(map.values());
        countList.sort(Collections.reverseOrder());

        // 많이 있는 크기부터 선택
        for (int count : countList) {
            k -= count;
            answer++;

            if (k <= 0) {
                break;
            }
        }

        return answer;
    }
}