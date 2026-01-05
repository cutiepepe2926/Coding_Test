import java.io.*;

public class Main {
    
    static StringBuilder sb = new StringBuilder();
    static int cnt = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        hanoi(n,1,3);
        System.out.println(cnt);
        System.out.println(sb);
    }
    
    static void hanoi(int n, int x, int y) {
        if (n>1) hanoi(n-1, x, 6-x-y);
        sb.append(x).append(" ").append(y).append("\n");
        cnt++;
        if (n>1) hanoi(n-1,6-x-y,y);
    }
    
}