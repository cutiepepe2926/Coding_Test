import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] alphabet = new int[6];
        for (int i=0; i<6; i++) {
            alphabet[i] = Integer.parseInt(st.nextToken());
        }

        int answer_x = 0;
        int answer_y = 0;

        for (int x=-999; x<=999; x++) {
            for (int y=-999; y<=999; y++) {
                if (alphabet[2]==(alphabet[0]*x+alphabet[1]*y)) {
                    if (alphabet[5]==(alphabet[3]*x+alphabet[4]*y)) {
                        answer_x = x;
                        answer_y = y;
                        x = 1000;
                        y = 1000;
                    }
                }
            }
        }
        System.out.println(answer_x+ " "+answer_y);
    }
}