import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        
        br.close();
        
        String[] words = new String[set.size()];
        
        Iterator<String> it = set.iterator();
        
        for (int i = 0; i < set.size(); i++) {
            words[i] = it.next();
        }
        
        Arrays.sort(words,(a,b) -> {
           int al = a.length();
           int bl = b.length();
            
           if (al == bl) {
               return a.compareTo(b);
           }
           return al - bl;
        });
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (String word : words) {
            bw.write(word+"\n");
        }
        
        bw.flush();
        bw.close();
    }
}