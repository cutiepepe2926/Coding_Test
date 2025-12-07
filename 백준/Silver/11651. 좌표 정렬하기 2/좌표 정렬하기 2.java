import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Coordinate[] list = new Coordinate[n];
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[i] = new Coordinate(
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())
            );    
        }
        br.close();
        
        Arrays.sort(list, (a,b) -> {
            if (a.y == b.y) {
                return Integer.compare(a.x, b.x);
            }
            return Integer.compare(a.y, b.y);
        });
        
        StringBuilder sb = new StringBuilder();
        
        for (Coordinate l : list) {
            sb.append(l.x).append(" ").append(l.y).append("\n");
        }
        
        System.out.println(sb.toString());
        
    }
    
    public static class Coordinate {
        int x;
        int y;
        
        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}