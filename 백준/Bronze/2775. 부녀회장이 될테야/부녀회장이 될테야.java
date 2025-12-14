import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[][] aparts = new int[15][16];

        for (int i = 1; i < 15; i++) {
            aparts[0][i] = i;
        }

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            if (n==1) {
                sb.append(1).append("\n");
                continue;
            }
            if (n==2) {
                sb.append(k+2).append("\n");
                continue;
            }

            if (k==1) {
                sb.append( (n*(n+1))/2 ).append("\n");
            }
            else {
                for (int floor = 1; floor <= n; floor++) {
                    for (int ho = 1; ho <= n; ho++) {
                        aparts[floor][ho] = aparts[floor][ho-1] + aparts[floor-1][ho];
                    }
                }
                sb.append(aparts[k][n]).append("\n");
            }
        }
        br.close();
        System.out.println(sb);
    }
}