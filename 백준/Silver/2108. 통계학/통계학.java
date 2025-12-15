import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        long avg = 0; //산술평균
        int[] list = new int[n]; //중앙값
        HashMap<Integer, Integer> map = new HashMap<>(); // 최빈값, 복수 개 시 두 번째로 작은 값
        int range = 0;



        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            avg += num;
            list[i] = num;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        double result = (double) avg/n;
        avg = Math.round(result); // 산술 평균
        Arrays.sort(list);
        int mid = list[(list.length-1)/2]; // 중앙값
        // 최빈값 구하기
        ArrayList<Integer> al = new ArrayList<>();
        int max = 0;
        for (int v : map.values()) max = Math.max(max, v);
        for (int i = 0; i < list.length; i++) {
            if (map.get(list[i]) == max) {
                if (al.indexOf(list[i]) == -1) {
                    al.add(list[i]);
                }
            }
        }
        int many = 0; //최빈값
        if (al.size()>=2) {
            many = al.get(1);
        }
        else {
            many = al.get(0);
        }

        range = list[list.length-1] - list[0]; // 범위

        sb.append(avg).append("\n")
                .append(mid).append("\n")
                .append(many).append("\n")
                .append(range);
        System.out.println(sb);
    }
}