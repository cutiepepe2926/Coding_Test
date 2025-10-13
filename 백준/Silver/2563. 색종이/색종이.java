import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //도화지 생성
        boolean DoHwaGi[][] = new boolean[100][100];

        //색종이의 수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int paperNum = Integer.parseInt(st.nextToken());
        //넓이
        int result = 0;

        //색종이 수만큼 반복
        for(int i=0;i<paperNum;i++){
            //좌,하단 길이 입력
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());
            for(int p_i=0;p_i<10;p_i++){
                for(int p_j=0;p_j<10;p_j++){
                    if(DoHwaGi[p_i+x][p_j+y]){
                        continue;
                    }
                    else {
                        DoHwaGi[p_i+x][p_j+y] = true;
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}