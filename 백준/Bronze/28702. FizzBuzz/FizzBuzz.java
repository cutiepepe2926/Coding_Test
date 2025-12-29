import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] list = new long[3];
        
        for (int i = 0; i < 3; i++) {
            String s = br.readLine();
            if (s.equals("Fizz") || s.equals("Buzz") || s.equals("FizzBuzz")) {
                list[i] = 0;
            }
            else {
                list[i] = Long.parseLong(s);
            }
        }
        
        long ans = 0;
        
        for (int i = 0, j = 3; i < 3; i++, j--) {
            if (list[i] != 0) {
                ans = list[i] + j;
                break;
            }
        }
        
        if (ans % 3 == 0 && ans % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (ans % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (ans % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(ans);
        }
    }
}