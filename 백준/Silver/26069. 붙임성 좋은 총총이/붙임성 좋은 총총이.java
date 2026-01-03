import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        map.put("ChongChong",0);
        StringTokenizer st = null;
        
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            if (map.containsKey(a) || map.containsKey(b)) {
                map.put(a,0);
                map.put(b,0);
            }
        }
        
        System.out.println(map.size());
        
    }
}