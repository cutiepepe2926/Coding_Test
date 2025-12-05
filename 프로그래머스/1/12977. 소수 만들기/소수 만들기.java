class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int one = 0; one < nums.length-2; one++) {
            
            for (int two = one + 1; two < nums.length-1; two++) {
                
                for (int three = two + 1; three < nums.length; three++) {
                    int num = nums[one] + nums[two] + nums[three];
                    
                    if (num%2==0) continue;
            
                    boolean ok = true;

                    for (int i=3; i < num; i++) {
                        if (num%i==0) {
                            ok = false;
                            break;
                        }
                    }

                    if (ok) answer++;
                        }
                    }
        }
        return answer;
    }
}