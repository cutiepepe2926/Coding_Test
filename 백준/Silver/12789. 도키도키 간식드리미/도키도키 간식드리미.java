import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Integer> sLine = new ArrayDeque<>();
        Deque<Integer> wLine = new ArrayDeque<>();
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            sLine.add(num);
            result[i] = num;
        }

        Arrays.sort(result);

        int i = 0;
        while (i < n) {
            if (sLine.peekFirst()==null) {
                if (wLine.peekLast()==null) {
                    System.out.println("Sad");
                    return;
                }
                else {
                    if (wLine.peekLast() == result[i]) {
                        wLine.pollLast();
                        i++;
                    }
                    else {
                        System.out.println("Sad");
                        return;
                    }
                }
            }
            else {
                if (sLine.peekFirst()==result[i]) {
                    sLine.pollFirst();
                    i++;
                }
                else {
                    if (wLine.peekLast()==null) {
                        wLine.add(sLine.pollFirst());
                    }
                    else {
                        if (wLine.peekLast()==result[i]) {
                            wLine.pollLast();
                            i++;
                        }
                        else {
                            wLine.add(sLine.pollFirst());
                        }
                    }
                }
            }
        }
        System.out.println("Nice");
    }
}