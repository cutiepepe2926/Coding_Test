import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        //1번 - 숫자 정렬
        Arrays.sort(numlist);
        
        int[] abs_list = numlist.clone();
        
        int lowest = 20000;
        int mid = 0;
        //2번 - n과의 절대값 차이 저장 후 가장 적은 값 찾기
        for (int i=0; i<abs_list.length; i++) {
            abs_list[i] = Math.abs(abs_list[i]-n);
            if (lowest > abs_list[i]) {
                lowest = abs_list[i];
                mid = i;
            }
            if (lowest == abs_list[i]) {
                mid = i;
            }
        }
        
        //3번 - 2개의 포인터로 조절해가면서 넣기
        int[] answer = new int[numlist.length];
        answer[0] = numlist[mid];
        
        int left = mid-1;
        int right = mid+1;
        for (int i=1; i<answer.length; i++) {
            if (left<0) { 
                answer[i] = numlist[right]; 
                right++; 
                continue;
            }
            if (right>answer.length-1) {
                answer[i] = numlist[left]; 
                left--; 
                continue;
            }
            if (abs_list[left] > abs_list[right]) {
                answer[i] = numlist[right];
                right++;
            }
            else if (abs_list[left] < abs_list[right]) {
                answer[i] = numlist[left];
                left--;
            }
            else {
                answer[i] = numlist[right];
                right++;
            }
        }
        
        return answer;
    }
    
    
}