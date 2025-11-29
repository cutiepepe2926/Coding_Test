import java.util.*;

class Solution {
    public int solution(int[] arr) {
        
        int[] before_arr = arr.clone();
        int answer = 0;
        
        while (true) {
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]%2==0 && arr[i]>=50) {
                    arr[i] = arr[i]/2;
                }
                
                if (arr[i]%2!=0 && arr[i]<50) {
                    arr[i] = arr[i]*2 +1;
                }
            }    
            
            answer++;
            
            if (Arrays.equals(before_arr, arr)) {
                break;
            }
            
            before_arr = arr.clone();
            
        }
        
        return --answer;
    }
}