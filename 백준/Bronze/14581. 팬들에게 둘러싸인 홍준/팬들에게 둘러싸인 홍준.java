import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fan = ":fan:";
        String idol = br.readLine();
        br.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==1 && j==1) {
                    sb.append(":"+idol+":");
                    continue;
                }
                sb.append(fan);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}