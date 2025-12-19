import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Balloon> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            Balloon balloon = new Balloon(Integer.parseInt(st.nextToken()),i);
            deque.add(balloon);
        }
        br.close();

        StringBuilder sb = new StringBuilder();

        while (true) {

            if (deque.isEmpty()) {
                break;
            }

            Balloon b = deque.removeFirst();
            sb.append(b.order).append(" ");
            int cnt = b.paper;
            if (b.paper > 0 ) {
                cnt += -1;
                while (cnt != 0) {
                    if (deque.isEmpty()) {
                        break;
                    }
                    deque.add(deque.removeFirst());
                    cnt--;
                }
            }
            else {
                while (cnt != 0) {
                    if (deque.isEmpty()) {
                        break;
                    }
                    deque.addFirst(deque.removeLast());
                    cnt++;
                }
            }

        }

        System.out.println(sb);

    }

    static class Balloon {
        int paper;
        int order;

        Balloon(int paper, int order) {
            this.paper = paper;
            this.order = order;
        }
    }
}