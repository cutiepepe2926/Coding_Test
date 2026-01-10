import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());
        br.close();
        int[] list = new int[n];
        
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(list);
        
        int head = 0;
        int tail = n - 1;
        int answer = 0;
        while (head < tail) {
            if (list[head] + list[tail] == x) {
                answer++;
                head++;
                tail--;
            }
            else if (list[head] + list[tail] > x) {
                tail--;
            }
            else {
                head++;
            }
        }
        
        System.out.println(answer);
        
    }
}