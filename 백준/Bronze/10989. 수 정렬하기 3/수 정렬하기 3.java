import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int max = findMax(arr);
        int[] answer = countingSort(arr, arr.length, max);
        
        StringBuilder sb = new StringBuilder();
        for (int v : answer) {
            sb.append(v).append("\n");
        }
        System.out.println(sb);
    }
    static int findMax(int[] arr) {
        int max = -1;
        for (int v : arr) max = Math.max(max, v);
        return max;
    }
    static int[] countingSort(int[] arr, int len, int max) {
        int[] result = new int[len];
        int[] cArr = new int[max+1];
        
        for (int v : arr) {
            cArr[v]++;
        }
        
        int sum = 0;
        for (int i = 0; i < cArr.length; i++) {
            sum += cArr[i];
            cArr[i] = sum;
        }
        
        for (int i = len - 1; i >= 0; i--) {
            int v = arr[i];
            result[cArr[v] - 1] = v;
            cArr[v]--;
        }
        
        return result;
        
    }
}