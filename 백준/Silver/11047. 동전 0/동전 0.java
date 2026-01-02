import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int kinds = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{return Integer.compare(b,a);});
        
        for (int i = 0; i < kinds; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }
        
        int answer = 0;
        
        while (target != 0) {
            int coin = pq.poll();
            if (coin > target) {
                continue;
            }
            else {
                answer += target / coin;
                target = target % coin;
            }
        }
        
        System.out.println(answer);
        
    }
}