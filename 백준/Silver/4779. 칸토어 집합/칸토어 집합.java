import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new  StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if (s == null) {
                break;
            }
//            if (s.equals("")) {
//                break;
//            }
            int n = Integer.parseInt(s);
            n = (int)Math.pow(3.0,n);
            //칸토어함수
            canto(n, true);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void canto(int n, boolean y) {
        if (n==0) {
            sb.append("-");
            return;
        }
        if (n==1 && y) {
            sb.append("-");
            return;
        }
        if (!y) {
            sb.append(" ".repeat(n));
            return;
        }
        canto(n/3, true);
        canto(n/3, false);
        canto(n/3, true);
    }
}