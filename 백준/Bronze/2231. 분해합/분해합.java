import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // N의 분해합은 N + N의 각 자리수의 합,
        // M의 분해합은 N == M은 N의 생성자
        // 245의 분해합은 256(245+2+4+5)
        // 245는 256의 생성자
        // N이 주어질 때 가장 작은 생성자 구하기
        // 그러니깐 N이 주어지면 얘를 만들수있는 가장 작은 생성자를 찾는게 목적이다.
        // 생성자(M) M + M의 각자리수의 합이 N이되는거 찾기임 ㅇㅇ
        int answer = 0;
        for (int i = 0; i<N; i++) {
            int result = i;
            String s = String.valueOf(i);
            int[] digits = new int[s.length()];
            for (int j=0; j<s.length(); j++) {
                digits[j] = s.charAt(j) - '0';
                result = result + digits[j];
            }
            if (result == N) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}