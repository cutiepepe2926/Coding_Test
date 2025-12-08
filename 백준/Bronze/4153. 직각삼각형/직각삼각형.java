import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String s = br.readLine();
            if (s.equals("0 0 0")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(s);

            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            if (a==b && b==c) {
                sb.append("wrong\n");
                continue;
            }

            long max = Math.max(a, Math.max(b, c));
            int cnt = 0;
            if (max == a) {
                cnt++;
                a=0;
            }
            if (max == b) {
                cnt++;
                b=0;
            }
            if (max == c) {
                cnt++;
                c=0;
            }
            if (cnt > 1) {
                sb.append("wrong\n");
                continue;
            }

            if (max * max == a*a + b*b + c*c) {
                sb.append("right\n");
            }

            else {
                sb.append("wrong\n");
            }
        }
        System.out.println(sb.toString());
    }
}