import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken());

        String s2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(s2);
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        String s3 = br.readLine();
        StringTokenizer st3 = new StringTokenizer(s3);
        int v = Integer.parseInt(st3.nextToken());

        int result = 0;

        for(int i=0;i<N;i++){
            if(arr[i]==v){
                result+=1;
            }
        }
        bw.write(result+"\n");
        bw.flush();
        br.close();
        bw.close();

    }
}