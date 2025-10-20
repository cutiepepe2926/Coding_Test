import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[][] chessPlate = new boolean[N][M];

        for (int i=0; i<N; i++) {
            String[] line = br.readLine().split("");
            for (int j=0; j<line.length; j++) {
                if (line[j].equals("W")) {
                    chessPlate[i][j] = true;
                }
                else {
                    chessPlate[i][j] = false;
                }
            }
        }

        int result = 64;
        for (int i=0; i<=N-8; i++) {
             for (int j=0; j<=M-8; j++) {
                 int temp = calcPaint(chessPlate, i,j);
                 result = Math.min(result,temp);
             }
        }
        System.out.println(result);
    }
    public static int calcPaint(boolean[][] chessPlate, int sero, int garo) {
        boolean state = chessPlate[sero][garo];
        int count = 0;
        for (int i=sero,end=sero+8; i<end; i++) {
            for (int j=garo,end2=garo+8; j<end2; j++) {
                if (chessPlate[i][j] != state) {
                    count++;
                }
                state = !state;
            }
            state = !state;
        }
        count = Math.min(count, 64-count);
        return count;
    }
}