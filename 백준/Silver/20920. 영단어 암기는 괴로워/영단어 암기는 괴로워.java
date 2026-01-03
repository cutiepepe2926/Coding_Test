import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.length() < m) continue;
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        ArrayList<Word> al = new ArrayList<>();

        for (Map.Entry<String, Integer> s : map.entrySet()) {
            al.add(new Word(s.getKey(), s.getValue()));
        }

        Collections.sort(al, (a,b) -> {
            if (a.n == b.n) {
                if (a.w.length() == b.w.length()) {
                    return a.w.compareTo(b.w);
                }
                return Integer.compare(b.w.length(), a.w.length());
            }
            return Integer.compare(b.n,a.n);
        });

        StringBuilder sb = new StringBuilder();
        for (Word word : al) {
            sb.append(word.w).append("\n");
        }

        System.out.println(sb);

    }

    static class Word {
        String w;
        int n;

        Word(String w, int n) {
            this.w = w;
            this.n = n;
        }

    }
}