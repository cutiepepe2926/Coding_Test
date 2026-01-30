import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nStr = br.readLine();
        long remainder = 0;
        long modulus = 20000303;

        for (int i = 0; i < nStr.length(); i++) {
            remainder = (remainder * 10 + (nStr.charAt(i) - '0')) % modulus;
        }
        
        System.out.println(remainder);
    }
}