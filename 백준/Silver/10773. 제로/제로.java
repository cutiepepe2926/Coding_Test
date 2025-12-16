import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Long> stack = new LinkedList<>();
        long answer = 0;
        
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine());
            if (num == 0) {
                answer -= stack.removeLast();
            }
            else {
                stack.add(num);
                answer += num;
            }
        }
        
        System.out.print(answer);
    }
}