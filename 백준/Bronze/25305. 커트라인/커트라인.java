import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        StringTokenizer scores = new StringTokenizer(br.readLine());
        LinkedList<Integer> LL = new LinkedList<>();

        for (int i=0; i<N; i++) {
            LL.add(Integer.parseInt(scores.nextToken()));
        }

        Collections.sort(LL);
        int result = 1001;
        int end_point = LL.size()-1;
        for (int i=0;i<k;i++) {
            result = LL.get(end_point);
            end_point--;
        }
        System.out.println(result);
    }
}
