import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int i=1;
        int result = 666;

        while (i!=N) {
            result++;
            if (String.valueOf(result).contains("666")){
                i++;
            }
        }
        System.out.println(result);
    }
}