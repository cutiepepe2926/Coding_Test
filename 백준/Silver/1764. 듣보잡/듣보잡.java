import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> unHear = new HashSet<>();
        Set<String> unSeen = new HashSet<>();
        Set<String> unHS = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            unHear.add(s);
        }

        for (int i = 0; i < m; i++) {
            String s3 = br.readLine();
            unSeen.add(s3);
        }

        for(String name : unSeen) {
            if (unHear.contains(name)) {
                unHS.add(name);
            }
        }
        String[] list = new String[unHS.size()];
        int i = 0;
        for (String s : unHS) {
            list[i++] = s;
        }

        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        sb.append(unHS.size()).append("\n");
        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.println(sb.toString());

    }
}