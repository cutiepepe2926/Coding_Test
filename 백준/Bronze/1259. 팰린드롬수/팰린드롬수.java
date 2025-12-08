import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exit = "";
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            exit = br.readLine(); 
            if (exit.equals("0")) {
                break;
            }
            String answer = "yes";
            for (int i = 0, j = exit.length()-1; i <= j; i++,j--) {
                if (exit.charAt(i) != exit.charAt(j)) {
                    answer = "no";
                    break;
                }
            }
            sb.append(answer+"\n");
        }
        
        System.out.println(sb.toString());
    }
}