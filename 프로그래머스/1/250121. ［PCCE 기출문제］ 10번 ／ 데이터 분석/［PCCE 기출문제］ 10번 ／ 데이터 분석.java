import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        LinkedList<int[]> ll = new LinkedList<>();
        
        int extIdx = 0;
        int sortIdx = 0;
        
        if (ext.equals("code")) {extIdx = 0;}
        if (ext.equals("date")) {extIdx = 1;}
        if (ext.equals("maximum")) {extIdx = 2;}
        if (ext.equals("remain")) {extIdx = 3;}
        
        if (sort_by.equals("code")) {sortIdx = 0;}
        if (sort_by.equals("date")) {sortIdx = 1;}
        if (sort_by.equals("maximum")) {sortIdx = 2;}
        if (sort_by.equals("remain")) {sortIdx = 3;}
        
        for (int i = 0; i < data.length; i++) {
            if (data[i][extIdx] < val_ext) {
                int[] table = {data[i][0], data[i][1], data[i][2], data[i][3]};
                ll.add(table);
            }
        }

        int[][] answer = new int[ll.size()][1];
        int i = 0;
        for (int[] l : ll) {
            answer[i++] = l;
        }
        final int fsortIdx = sortIdx;
        Arrays.sort(answer, (a,b)-> {
            return Integer.compare(a[fsortIdx], b[fsortIdx]);
        });
        
        return answer;
    }
}