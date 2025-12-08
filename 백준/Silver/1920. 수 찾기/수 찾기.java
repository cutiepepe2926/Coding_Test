import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        HashMap<String, Integer> map = new HashMap<>();
        
        while(st.hasMoreTokens()) {
            map.put(st.nextToken(),0);
        }
        
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        while(st2.hasMoreTokens()) {
            if (map.get(st2.nextToken())==null) {
                sb.append("0\n");
            }
            else {
                sb.append("1\n");
            }
        }
        
        System.out.println(sb.toString());
        
    }
}