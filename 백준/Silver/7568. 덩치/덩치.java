import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Person[] pl = new Person[n]; // 순서를 유지할 Person 배열
        int[] rl = new int[n]; // 순서 별로 순위를 저장할 rank 배열
        Arrays.fill(rl, 1);

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int kg = Integer.parseInt(st.nextToken());
            int cm = Integer.parseInt(st.nextToken());
            pl[i] = new Person(kg, cm);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j) continue;
                if (pl[i].kg > pl[j].kg && pl[i].cm > pl[j].cm) {
                    continue;
                }
                else if (pl[i].kg < pl[j].kg && pl[i].cm < pl[j].cm) {
                    rl[i]++;
                }
                else {
                    continue;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int v : rl) {
            sb.append(v).append(" ");
        }
        System.out.println(sb);
    }

    static class Person {
        int kg;
        int cm;

        Person(int kg, int cm) {
            this.kg = kg;
            this.cm = cm;
        }
    }
}