import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        char[] bomb = br.readLine().toCharArray();
        br.close();

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length; i++) {
            stack.add(s[i]);
            if (stack.peekLast() == bomb[bomb.length - 1]) {
                boolean boom = true;
                Deque<Character> temp = new ArrayDeque<>();
                for (int j = bomb.length - 1; j >= 0; j--) {
                    if (stack.isEmpty()) {
                        boom = false;
                        break;
                    }
                    char c = stack.pollLast();
                    if (c == bomb[j]) {
                        temp.add(c);
                    }
                    else {
                        temp.add(c);
                        boom = false;
                        break;
                    }
                }

                if (!boom) {
                    while (!temp.isEmpty()) {
                        stack.addLast(temp.pollLast());
                    }
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (stack.isEmpty()) {
            System.out.println("FRULA");
        }
        else {
            while (!stack.isEmpty()) {
                bw.write(stack.pollFirst());
            }
            bw.flush();   
        }
        bw.close();
    }
}