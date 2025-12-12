import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println((n==0)?1:factorial(n));
    }
    static long factorial(long n) {
        if (n<=1) {
            return n;
        }
        else {
            return n * factorial(n-1);
        }
    }
}
