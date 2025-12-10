import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long num = gcd(a,b);
        System.out.println(a/num*b);
        
    }
    
    public static long gcd(long x, long y) {
        if (y==0) {
            return x;
        }
        else {
            return gcd(y, x%y);
        }
    }
    
}