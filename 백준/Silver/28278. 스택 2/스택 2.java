import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            int num = 0;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            
            if (command == 1) {
                stack.add(num);
            }
            else if (command == 2) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(stack.removeLast()).append("\n");
                }
            }
            else if (command == 3) {
                sb.append(stack.size()).append("\n");
            }
            else if (command == 4) {
                if (stack.isEmpty()) {
                    sb.append(1).append("\n");
                }
                else {
                    sb.append(0).append("\n");
                }
            }
            else {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(stack.peekLast()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}