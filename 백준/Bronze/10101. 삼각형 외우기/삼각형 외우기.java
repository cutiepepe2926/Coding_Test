import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a + b + c != 180) { // 180이 아닌 경우
            System.out.println("Error");
            return;
        }
        if (a == b & b == c & a == c) { // 모두 60
            System.out.println("Equilateral");
            return;
        }
        if ( a == b | b == c | a == c) { // 2개가 같은 경우
            System.out.println("Isosceles");
            return;
        }
        // 모두 다른 경우
        System.out.println("Scalene");
    }
}