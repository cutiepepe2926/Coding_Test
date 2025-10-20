import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 10000;
        for (int kg5=0; kg5<=1000 && 5*kg5<=N; kg5++) {
            for (int kg3=0; kg3<=2000 && 3*kg3<=N; kg3++) {
                if (5*kg5+3*kg3==N) {
                    result = Math.min(result,kg5+kg3);
                }
            }
        }
        if (result == 10000) {
            System.out.println(-1);
        }
        else {
            System.out.println(result);
        }
    }
}