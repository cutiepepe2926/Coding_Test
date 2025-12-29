import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long N = Long.parseLong(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] sizes = new long[6];
        
        int idx = 0;
        while (st.hasMoreTokens()) {
            sizes[idx++] = Long.parseLong(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        long T = Long.parseLong(st.nextToken());
        long P = Long.parseLong(st.nextToken());
        
        br.close();
        
        StringBuilder sb = new StringBuilder();
        
        long shirts = 0;
        
        for (int i = 0; i < 6; i++) {
            if (sizes[i]%T == 0) {
                shirts += sizes[i]/T;
            }
            else {
                shirts += ( sizes[i]/T ) + 1;
            }
        }
        
        // 티셔츠 묶음 수
        sb.append(shirts).append("\n");
        // 펜 갯수
        sb.append(N/P).append(" ").append(N%P);
        
        System.out.println(sb);
    }
}