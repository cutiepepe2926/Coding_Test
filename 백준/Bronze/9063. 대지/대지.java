import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 점의 개수
        int[][] coordinate = new int[N][2]; // 각 점의 좌표를 저장할 정수형2차원배열
        int xMax = -10000;
        int xMin = 10000;
        int yMax = -10000;
        int yMin = 10000;
        // 좌표 저장
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            coordinate[i][0] = Integer.parseInt(st.nextToken());
            coordinate[i][1] = Integer.parseInt(st.nextToken());
            xMax = Math.max(xMax, coordinate[i][0]);
            xMin = Math.min(xMin, coordinate[i][0]);
            yMax = Math.max(yMax, coordinate[i][1]);
            yMin = Math.min(yMin, coordinate[i][1]);
        }
        System.out.println((xMax-xMin)*(yMax-yMin));
    }
}