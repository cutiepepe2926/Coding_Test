import java.util.*;

class Solution {
    public int solution(int price) {
        
        double p = (double)price;
        double discount = 0.0;
        
        if (price<100000) {
            return price;
        }
        
        if (price>=100000 && price<300000) {
            discount = 0.05;
        }
        
        if (price>=300000 && price<500000) {
            discount = 0.1;
        }
        
        if (price>=500000) {
            discount = 0.2;
        }
        
        double temp = p - (p*discount);
        
        int answer = (int)(temp);
        
        return answer;
    }
}