import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int documentNum = Integer.parseInt(st.nextToken());
            // 문서의 개수
            int targetPos = Integer.parseInt(st.nextToken());
            // 몇 번째로 인쇄되었는지 궁금한 문서의 현재 위치

            // 문서의 중요도
            StringTokenizer value = new StringTokenizer(br.readLine());
            // 프린트 큐
            Deque<Print> printQue = new ArrayDeque<>();
            // 중요도 역순 정렬
            int[] important = new int[documentNum];

            for (int j = 0; j < documentNum; j++) {
                int num = Integer.parseInt(value.nextToken());
                printQue.add(new Print(num, j == targetPos));
                important[j] = num;
            }

            Arrays.sort(important);

            cnt = 1;
            int impPtr = important.length - 1;
            while (true) {
                if (printQue.peekFirst().priority == important[impPtr]) {
                    Print p = printQue.removeFirst();
                    if (p.target) {
                        sb.append(cnt).append("\n");
                        break;
                    } else {
                        cnt++;
                        impPtr--;
                    }
                } else {
                    printQue.add(printQue.removeFirst());
                }
            }
        }
        System.out.println(sb);
    }
    static class Print {
        int priority;
        boolean target;

        Print(int priority, boolean target) {
            this.priority = priority;
            this.target = target;
        }
    }
}