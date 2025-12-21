import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            int num = 0;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            if (order.equals("add")) {
                set.add(num);
            }
            else if (order.equals("remove")) {
                set.remove(num);
            }
            else if (order.equals("check")) {
                if (set.contains(num)) {
                    sb.append(1).append("\n");
                }
                else {
                    sb.append(0).append("\n");
                }
            }
            else if (order.equals("toggle")) {
                if (set.contains(num)) {
                    set.remove(num);
                }
                else {
                    set.add(num);
                }
            }
            else if (order.equals("all")) {
                for (int j = 1; j <= 20; j++) {
                    set.add(j);
                }
            }
            else {
                set.clear();
            }
        }
        System.out.println(sb);
    }
}