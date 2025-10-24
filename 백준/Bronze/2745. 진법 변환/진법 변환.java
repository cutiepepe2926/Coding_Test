import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        long B = Long.parseLong(st.nextToken());

        LinkedList<Long> LL = new LinkedList<>();

        for (int i=0; i<N.length(); i++) {
            if (N.charAt(i)<65) {
                LL.add(Long.parseLong(String.valueOf(((int)N.charAt(i)-48))));
            } else {
                LL.add(Long.parseLong(String.valueOf(((int)N.charAt(i)-55))));
            }
        }

        long result = 0;
        long j = 1;
        for (int i=LL.size()-1; i>=0; i--) {
            long temp = LL.get(i);
            result += temp * j;
            j = j * B;
        }
        System.out.println(result);
    }
}
