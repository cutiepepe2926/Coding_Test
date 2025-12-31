import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        HashMap<String, String> map = new HashMap<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            sb.append(map.get(s)).append("\n");
        }
        System.out.println(sb);
    }
}