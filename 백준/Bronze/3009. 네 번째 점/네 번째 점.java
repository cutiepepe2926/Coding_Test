import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] sArry = new String[3][2];
        for(int i=0;i<3;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            sArry[i][0] = st.nextToken();
            sArry[i][1] = st.nextToken();
        }
        String x = null;
        String y = null;
        if(sArry[0][0].equals(sArry[1][0])){
            x = sArry[2][0];
        }
        else if(sArry[0][0].equals(sArry[2][0])){
            x = sArry[1][0];
        }
        else {
            x = sArry[0][0];
        }

        if(sArry[0][1].equals(sArry[1][1])){
            y = sArry[2][1];
        }
        else if(sArry[0][1].equals(sArry[2][1])){
            y = sArry[1][1];
        }
        else  {
            y = sArry[0][1];
        }
        System.out.println(x+" "+y);

    }
}