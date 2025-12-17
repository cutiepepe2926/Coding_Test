import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            Integer num = 0;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            
            if (order.equals("push")) {
                deque.add(num);
                continue;
            }
            else if (order.equals("pop")) {
                num = deque.pollFirst();
                if (num == null) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(num).append("\n");
                }
                continue;
            }
            else if (order.equals("size")) {
                sb.append(deque.size()).append("\n");
                continue;
            }
            else if (order.equals("empty")) {
                if (deque.isEmpty()) {
                    sb.append(1).append("\n");
                }
                else {
                    sb.append(0).append("\n");
                }
            }
            else if (order.equals("front")) {
                num = deque.peekFirst();
                if (num == null) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(num).append("\n");
                }
                continue;
            }
            else {
                //back
                num = deque.peekLast();
                if (num == null) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(num).append("\n");
                }
                continue;
            }
        }
        System.out.println(sb);
    }
}