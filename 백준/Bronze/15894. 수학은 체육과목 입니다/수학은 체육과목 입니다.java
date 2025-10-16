import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long square = 0;
        long j=0;

        for (long i=1;i<=n;i++){
            square = square+i;
            j = j + ((i-1)*2);
        }

        long outerline = 4*square;
        long innerline = 2*j;
        System.out.println(outerline-innerline);
    }
}