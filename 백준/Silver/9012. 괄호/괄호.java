import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            Deque<String> stack = new ArrayDeque<>();
            String lines = br.readLine();

            if (lines.length()%2!=0) {
                sb.append("NO\n");
                continue;
            }

            boolean wrong = false;

            for (String s : lines.split("")) {
                if (s.equals("(")) {
                    stack.add("(");
                }
                else {
                    if (stack.peekLast() == null) {
                        wrong = true;
                        break;
                    }
                    else {
                        stack.pollLast();
                    }
                }
            }
            if (stack.isEmpty() && !wrong) {
                sb.append("YES\n");
            }
            else {
                sb.append("NO\n");
            }
        }
        System.out.println(sb);
    }
}