import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            int answer = 0;
            String[] list = br.readLine().split("X");
            for (int j = 0; j < list.length; j++) {
                int num = list[j].length();
                answer += (num*(num+1))/2;
            }
            sb.append(answer+"\n");
        }
        System.out.println(sb.toString());
    }
}