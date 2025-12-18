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
            Integer num = 0;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            
            if (order.equals("push")) {
                deque.add(num);
            }
            else if (order.equals("pop")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(deque.removeLast()).append("\n");
                }
            }
            else if (order.equals("size")) {
                sb.append(deque.size()).append("\n");
            }
            else if (order.equals("empty")) {
                if (deque.isEmpty()) {
                    sb.append(1).append("\n");
                }
                else {
                    sb.append(0).append("\n");
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