import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] cards = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            cards[i] = Integer.parseInt(st2.nextToken());
        }
        // 큰 순으로 정렬

        int result = 0;
        int best = 0;

        for(int i=N-1; i>=2; i--){
            for(int j=i-1; j>=1; j--){
                for(int k=j-1; k>=0; k--){
                    result = cards[i] + cards[j] + cards[k];
                    if(result<=M && result > best){
                        best = result;
                    }
                }
            }
        }
//        for(int i = 0; i < N-1; i++){
//            for(int j = i+1; j < N-2; j++){
//                for(int k = j+1; k < N-3; k++) {
//                    result = cards[i] + cards[j] + cards[k];
//                    if(result<=M && result > best) {
//                        best = result;
//                    }
//                }
//            }
//        }
        System.out.println(best);
    }
}