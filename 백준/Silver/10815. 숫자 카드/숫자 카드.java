import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            map.put(st.nextToken(), 0);
        }
        
        int m = Integer.parseInt(br.readLine()); 
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            boolean exist = map.containsKey(st2.nextToken());
            if (exist) {
                sb.append("1 ");
            }
            else {
                sb.append("0 ");
            }
            
        }
        System.out.println(sb.toString());
    }
}