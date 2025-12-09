import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> reverseMap = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            map.put(name, i+1);
            reverseMap.put(i+1,name);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            String quiz = br.readLine();
            if ( (quiz.charAt(0) - '0') >= 0 && (quiz.charAt(0) - '0') <= 9 ) {
                sb.append(reverseMap.get(Integer.parseInt(quiz))).append("\n");
            }
            else {
                sb.append(map.get(quiz)).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}