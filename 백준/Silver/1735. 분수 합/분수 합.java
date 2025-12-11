import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A1 = Integer.parseInt(st.nextToken());
        int B1 = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int A2 = Integer.parseInt(st2.nextToken());
        int B2 = Integer.parseInt(st2.nextToken());

        int mom = gcd(B1, B2);
        int sumMom = B1*B2 / mom;
        A1 = sumMom/B1 * A1;
        A2 = sumMom/B2 * A2;

        int sumSon = A1 + A2;

        int giyak = gcd(sumSon, sumMom);
        while (giyak != 1) {
            sumMom /= giyak;
            sumSon /= giyak;
            giyak = gcd(sumSon, sumMom);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sumSon).append(" ").append(sumMom);
        System.out.println(sb);

    }

    public static int gcd(int x, int y) {
        if (y==0) {
            return x;
        }
        else {
            return gcd(y, x%y);
        }
    }
}