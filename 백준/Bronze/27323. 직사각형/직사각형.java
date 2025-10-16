import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sero = Integer.parseInt(br.readLine());
        int garo = Integer.parseInt(br.readLine());

        System.out.println(garo*sero);
    }
}
