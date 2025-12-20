import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<ABS> pq = new PriorityQueue<>((a,b) -> {
            int absA = a.absNum;
            int absB = b.absNum;

            if (absA == absB) {
                return Integer.compare(a.num, b.num);
            }
            return Integer.compare(absA,absB);
        });
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int order = Integer.parseInt(br.readLine());

            if (order == 0) {
                if (pq.isEmpty()) {
                    sb.append(0).append("\n");
                }
                else {
                    sb.append(pq.poll().num).append("\n");
                }
            }
            else {
                pq.add(new ABS(order, Math.abs(order)));
            }
        }
        System.out.println(sb);
    }

    static class ABS {
        int num;
        int absNum;

        ABS(int num, int absNum) {
            this.num = num;
            this.absNum = absNum;
        }
    }
}