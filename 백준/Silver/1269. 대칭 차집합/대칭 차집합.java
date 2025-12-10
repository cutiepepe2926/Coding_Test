import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> amb = new HashMap<>();
        HashMap<Integer, Integer> bma = new HashMap<>();
        HashMap<Integer, Integer> temp = new HashMap<>();
        
        StringTokenizer sta = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            int num = Integer.parseInt(sta.nextToken());
            amb.put(num,0);
            temp.put(num,0);
        }
        
        StringTokenizer stb = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            int num = Integer.parseInt(stb.nextToken());
            if  (amb.containsKey(num)) {
                amb.remove(num);
            }
            
            if (!temp.containsKey(num)) {
                bma.put(num,0);
            }
        }
        
        System.out.println(amb.size() + bma.size());
        
    }
}