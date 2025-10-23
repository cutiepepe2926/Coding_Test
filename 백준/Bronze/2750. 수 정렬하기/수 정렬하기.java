import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> LL = new LinkedList<>();
        for (int i=0;i<N;i++) {
            int temp = Integer.parseInt(br.readLine());
            LL.add(temp);
        }

        Collections.sort(LL);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=0;i<LL.size();i++) {
            bw.write(LL.get(i)+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
