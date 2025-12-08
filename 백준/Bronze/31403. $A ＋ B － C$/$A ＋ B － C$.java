import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        for (int i = 0; i < 2; i++) {
            String snum = br.readLine();
            sb.append(snum);
            int num = Integer.parseInt(snum);
            answer += num;
        }
        String snum = br.readLine();
        StringBuilder sanswer = new StringBuilder();
        int num = Integer.parseInt(snum);
        sanswer.append(Integer.parseInt(sb.toString()) - num);
        answer -= num;
        
        System.out.println(answer+"\n"+sanswer.toString());
    }
}