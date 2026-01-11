import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        if (list.get(0) > 0) {
            sb.append(list.get(0)).append(" ").append(list.get(1));
            System.out.println(sb);
            return;
        }

        if (list.get(list.size() - 1) < 0) {
            sb.append(list.get(list.size() - 2)).append(" ").append(list.get(list.size() - 1));
            System.out.println(sb);
            return;
        }

        int front = 0;
        int end = list.size() - 1;
        int[] cache = new int[3];
        // cache[0] = front, cache[1] = end, cache[2] = f + e
        cache[2] = Integer.MAX_VALUE;

        while (front < end) {

            int temp = list.get(front) + list.get(end);
            
            if (Math.abs(temp) < cache[2]) {
                cache[0] = front;
                cache[1] = end;
                cache[2] = Math.abs(temp);
            }

            if (temp == 0) {
                cache[0] = front;
                cache[1] = end;
                break;
            }
            else if (temp > 0) {
                end--;
            }
            else {
                front++;
            }
        }

        sb.append(list.get(cache[0])).append(" ").append(list.get(cache[1]));
        System.out.println(sb);
    }
}