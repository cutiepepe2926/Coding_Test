import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        // 스택
        Deque<Integer> stack = new ArrayDeque<>();
        int curNum = 1;
        boolean possible = true;
        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());
            
            while (curNum <= target) {
                stack.add(curNum);
                curNum++;
                sb.append("+\n");
            }
            
            if (!stack.isEmpty() && stack.peekLast() == target) {
                stack.pollLast();
                sb.append("-\n");
            }
            else {
                possible = false;
                break;
            }
            
        }
        System.out.println((possible)?sb:"NO");
    }
}