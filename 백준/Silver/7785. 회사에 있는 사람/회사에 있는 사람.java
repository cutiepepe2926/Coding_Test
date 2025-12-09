import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String order = st.nextToken();
            
            if (order.equals("enter")) {
                map.put(name, 0);
            }
            else {
                map.remove(name);
            }
        }
        
        int idx = 0;
        String[] list = new String[map.size()];
        
        for (String s : map.keySet()) {
            list[idx++] = s; 
        }
        
        Arrays.sort(list, (a,b) -> {
            return a.compareTo(b) * -1;
        });
        
        StringBuilder sb = new StringBuilder();
        
        for (String s : list) {
            sb.append(s).append("\n");
        }
        
        System.out.println(sb.toString());
        
    }
}