import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        if (num == 1) {
            long v = Long.parseLong(br.readLine());
            sb.append(v*v);
        }
        else {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long min = 1000001;
            long max = 1;
            
            while (st.hasMoreTokens()) {
                long v = Long.parseLong(st.nextToken());
                if (v > max) {
                    max = v;
                }
                if (v < min) {
                    min = v;
                }
            }
            sb.append(min*max);
        }
        
        System.out.println(sb);
    }
}