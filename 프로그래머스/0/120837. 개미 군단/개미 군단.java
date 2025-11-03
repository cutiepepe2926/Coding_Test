class Solution {
    public int solution(int hp) {
        int answer = 0;
        int dmg = hp;
        answer += dmg/5;
        dmg = dmg%5;
        answer += dmg/3;
        dmg = dmg%3;
        answer += dmg;
        return answer;
    }
}