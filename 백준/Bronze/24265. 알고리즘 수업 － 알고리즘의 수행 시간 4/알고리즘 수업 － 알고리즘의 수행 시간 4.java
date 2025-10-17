import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long result = 0;
        for(long i=1;i<=n-1;i++){
            result += i;
        }
        System.out.println(result+"\n"+2);
    }
}