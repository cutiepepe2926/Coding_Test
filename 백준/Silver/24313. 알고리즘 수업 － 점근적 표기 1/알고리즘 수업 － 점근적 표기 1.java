import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 =  Integer.parseInt(br.readLine());

        for(;n0<=100;n0++){
            if(a1*n0+a0 > n0*c) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}