import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        br.close();
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i =m; i <=n; i++) {
            if (isPrime(i)) {
                al.add(i);
            }
        }
        if (al.size()==0) {
            System.out.println(-1);
            return;
        }
        int max = al.size();
        int sum = 0;
        int min = al.get(0);
        for (int i = 0; i < max; i++) {
            sum += al.get(i);
        }
        
        System.out.println(sum);
        System.out.println(min);
        
    }
    static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0) return (n==2);
        if (n % 3 == 0) return (n==3);
        
        for (int d = 5; d <= n / d; d += 6) {
            if (n % d == 0 || n % (d+2) == 0) return false;
        }
        return true;
    }
}