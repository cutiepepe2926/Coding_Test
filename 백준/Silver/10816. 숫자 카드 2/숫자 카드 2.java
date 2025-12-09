import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            String num = st.nextToken();
            boolean check = map.containsKey(num);
            int value;
            if (check) {
                value = map.get(num) + 1;
            }
            else {
                value = 1;
            }
            map.put(num, value);
        }
        
        int m = Integer.parseInt(br.readLine()); 
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            String num2 = st2.nextToken();
            boolean exist = map.containsKey(num2);
            if (exist) {
                sb.append(map.get(num2) + " ");
            }
            else {
                sb.append("0 ");
            }
            
        }
        System.out.println(sb.toString());
    }
}