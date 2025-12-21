import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> qs = new ArrayDeque<>();
        int[] qList = new int[n]; //큐인지 스택인지 판별용

        // 초기 자료구조 셋팅 (Queue만)
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            qList[i] = Integer.parseInt(st.nextToken());
        }

        //  큐에 만 초기 값 삽입
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (qList[i] == 0) {
                qs.add(num);
            }
        }

        // 삽입할 원소의 길이 M
        int m = Integer.parseInt(br.readLine());

        // 원소 삽입
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            qs.addFirst(num);
            sb.append(qs.pollLast()).append(" ");
        }
        System.out.println(sb);
    }
}