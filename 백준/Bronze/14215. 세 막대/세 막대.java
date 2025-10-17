import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sticks = new int[3];

        for(int i=0;i<3;i++){
            sticks[i] = Integer.parseInt(st.nextToken());
        }

        // 큰 순으로 정렬
        Arrays.sort(sticks);

        // 삼각형 조건을 만족하는 경우
        if (sticks[0]+sticks[1] > sticks[2]) {
            System.out.println(sticks[0]+sticks[1]+sticks[2]);
            return;
        }

        // 삼각형 조건을 만족하지 못하는 경우
        System.out.println(sticks[0]+sticks[1]+(sticks[0]+sticks[1]-1));
    }
}