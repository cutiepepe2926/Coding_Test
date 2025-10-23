import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 5;
        LinkedList<Integer> LL = new LinkedList<>();
        for (int i=0; i<5; i++) {
            LL.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(LL);
        int total = 0;
        for (int i=0; i<LL.size(); i++) {
            total += LL.get(i);
        }
        System.out.println((total/5)+"\n"+LL.get(2));
    }
}
