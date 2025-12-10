import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sarr =  br.readLine().split("");
        int answer = 0;

        if (sarr[sarr.length-1].equals("*")) {
            int sum = 0;
            for (int i = 0; i < sarr.length-1; i++) {
                if (i%2==0) {
                    sum += Integer.parseInt(sarr[i]);
                }
                else {
                    sum += 3 * Integer.parseInt(sarr[i]);
                }
            }
            if (sum%10==0) {
                answer = 0;
            }
            else {
                answer = 10 - (sum % 10);   
            }
        }
        else {
            int sum = 0;
            int m = 10 - Integer.parseInt(sarr[sarr.length-1]);
            if (m==10) {
                m = 0;
            }
            int weight = 1;
            
            for (int i = 0; i < sarr.length - 1; i++) {
                if (sarr[i].equals("*")) {
                    if (i%2!=0) {
                        weight = 3;
                    }
                    continue;
                }
                
                if (i%2==0) {
                    sum += Integer.parseInt(sarr[i]);
                }
                else {
                    sum += 3 * Integer.parseInt(sarr[i]);
                }
            }
            
            for (int i = 0; i <= 9; i++) {
                int result = ((sum + (weight*i))%10);
                if (result == 10) {
                    answer = 0;
                    break;
                }
                if (m - result == 0) {
                    answer = i;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}