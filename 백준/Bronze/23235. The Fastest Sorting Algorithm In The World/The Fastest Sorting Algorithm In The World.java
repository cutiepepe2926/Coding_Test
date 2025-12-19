import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if (st.nextToken().equals("0")) {
                break;
            }
            else {
                sb.append("Case ").append(i++).append(": Sorting... done!").append("\n");
            }
        }
        System.out.println(sb);
    }
}