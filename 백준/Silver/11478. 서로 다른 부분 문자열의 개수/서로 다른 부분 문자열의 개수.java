import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();
        
        Set<String> words = new HashSet<>();
        
        int max = s.length();
        for (int i = 1; i <= s.length(); i++ ) {
            
            for (int idx = 0; idx < s.length(); idx++ ) {
                if (idx + i > max) {
                    break;
                }
                else {
                    words.add(s.substring(idx, idx+i));   
                }
            }
        }
        System.out.println(words.size());
    }
}