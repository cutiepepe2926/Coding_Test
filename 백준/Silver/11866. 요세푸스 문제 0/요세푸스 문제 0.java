import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        int cnt = 1;
        while (!deque.isEmpty()) {
            if (cnt == k) {
                int num = deque.removeFirst();
                if (deque.isEmpty()) {
                    sb.append(num).append(">");
                }
                else {
                    sb.append(num).append(", ");
                }
                cnt = 1;
            }
            else {
                deque.add(deque.removeFirst());
                cnt++;
            }
        }
        System.out.println(sb);
    }
}