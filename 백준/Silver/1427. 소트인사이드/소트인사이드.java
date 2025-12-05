import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();
        
        String[] arr = s.split("");
        
        mergeSort(arr);
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);    
        }
        
        System.out.println(sb.toString());
        
    }
    
    static void mergeSort(String[] arr) {
        String[] temp = new String[arr.length];
        mergeSortSlice(arr, temp, 0, arr.length-1);
    }
    
    static void mergeSortSlice(String[] arr, String[] temp, int left, int right) {
        if (left >= right) return;
        int mid = left + right >>> 1;
        
        int pl = left;
        int pr = mid + 1;
        int writeIndex = left;
        
        mergeSortSlice(arr, temp, left, mid);
        mergeSortSlice(arr, temp, mid + 1, right);
        
        while (pl <= mid && pr <= right) {
            temp[writeIndex++] = (Integer.parseInt(arr[pl]) >= Integer.parseInt(arr[pr]))
                ? arr[pl++]
                : arr[pr++];
        }
        
        while (pl <= mid) {
            temp[writeIndex++] = arr[pl++];
        }
        
        while (pr <= right) {
            temp[writeIndex++] = arr[pr++];
        }
        
        for (int i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
        
    }
    
}