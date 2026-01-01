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
            int n = Integer.parseInt(s);
            n = (int)Math.pow(3.0,n);
            //칸토어함수
            canto(n);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void canto(int n) {
        if (n<=1) {
            sb.append("-");
            return;
        }
        
        int three = n/3;
        canto(three);
        sb.append(" ".repeat(three));
        canto(three);
        
    }
}