import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cntFive = 0;
        
        for (int i = n; i >=5; i--) {
            if (i % 5 == 0) {
                int temp = i;
                while (temp % 5 == 0) {
                    cntFive++;
                    temp = temp / 5;
                }
            }
        }
        System.out.println(cntFive);
    }
}