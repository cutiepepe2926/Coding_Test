import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int cycles = 1;
        int start = 1;
        int end = 1;

        for (int i=1,j=2; X > start && X > end;) {
            cycles++;
            start = start + i;
            end = end + j;
            i++;
            j++;
        }

        int pos = X - start + 1;

        if (cycles%2==0) {
            System.out.println(pos+"/"+(cycles-pos+1));
        } else {
            System.out.println((cycles-pos+1)+"/"+pos);
        }
    }
}