import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            int num = 0;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            
            
            if (order.equals("1")) {
                deque.addFirst(num);
            }
            else if (order.equals("2")) {
                deque.addLast(num);
            }
            else if (order.equals("3")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(deque.removeFirst()).append("\n");
                }
            }
            else if (order.equals("4")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(deque.removeLast()).append("\n");
                }
            }
            else if (order.equals("5")) {
                sb.append(deque.size()).append("\n");
            }
            else if (order.equals("6")) {
                if (deque.isEmpty()) {
                    sb.append(1).append("\n");
                }
                else {
                    sb.append(0).append("\n");
                }
            }
            else if (order.equals("7")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(deque.peekFirst()).append("\n");
                }
            }
            else {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(deque.peekLast()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}