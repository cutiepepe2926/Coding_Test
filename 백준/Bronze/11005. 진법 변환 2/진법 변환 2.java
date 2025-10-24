import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        LinkedList<Long> LL = new LinkedList<>();

        // 참고로 저장은 역순임!!!
        for (long i=N;i>0;) {
            if (i<B) {
                LL.add(i);
                break;
            }
            long temp = i%B;
            LL.add(temp);
            i=i/B;
        }


        for (int i=LL.size()-1; i>=0; i--) {
            if (LL.get(i)>9) {
                System.out.print((char)(55+LL.get(i)));
            }
            else {
                System.out.print(LL.get(i));
            }
        }
    }
}

