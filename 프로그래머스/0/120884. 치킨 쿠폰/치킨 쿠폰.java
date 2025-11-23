class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        while (coupon >= 10) {
            int service = coupon / 10;         // 이번에 받는 서비스 치킨 수
            answer += service;                 // 서비스 치킨 누적
            coupon = service + (coupon % 10);  // 새 쿠폰 + 남은 쿠폰
        }
        return answer;
    }
}