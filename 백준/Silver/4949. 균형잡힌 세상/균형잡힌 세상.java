import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String lines = br.readLine();
            Deque<String> stack = new ArrayDeque<>();
            if (lines.startsWith(".")) {
                break;
            }

            boolean perfect = true;
            for (String s : lines.split("")) {
                if (s.equals("(") || s.equals("[")) {
                    stack.add(s);
                }
                else if (s.equals("]")) {
                    if (stack.isEmpty()) {
                        perfect = false;
                        break;
                    }
                    else {
                        if (stack.peekLast().equals("[")) {
                            stack.pollLast();
                        }
                        else {
                            perfect = false;
                            break;
                        }
                    }
                }
                else if (s.equals(")")) {
                    if (stack.isEmpty()) {
                        perfect = false;
                        break;
                    }
                    else {
                        if (stack.peekLast().equals("(")) {
                            stack.pollLast();
                        }
                        else {
                            perfect = false;
                            break;
                        }
                    }
                }
                else {
                    continue;
                }
            }
            if (stack.isEmpty() && perfect) {
                sb.append("yes\n");
            }
            else {
                sb.append("no\n");
            }
        }

        System.out.println(sb);
    }
}