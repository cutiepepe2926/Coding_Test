import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        Node[] total = new Node[rank.length];
        
        for (int i = 0; i < total.length; i++) {
            Node temp = new Node(rank[i], i, attendance[i]);
            total[i] = temp;
        }
        
        bubblesort(total, total.length);
        
        int[] top_rank = new int[3];
        int i = 0;
        
        for (Node each : total) {
            if (i>=3) {
                break;
            }
            if (each.attend==true) {
                top_rank[i++] = each.idx;
            }
        }
        
        int answer = 10000*top_rank[0] + 100*top_rank[1] + top_rank[2];
        return answer;
    }
    
    public static void swap(Node[] arr, int a, int b) {
        Node temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
    
    public static void bubblesort(Node[] arr, int n) {
        
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-1-i; j++) {
                if (arr[j].rank > arr[j+1].rank) {
                    swap(arr, j, j+1);
                }
            }
        }
        
    }
    
}

class Node {
    
    int rank;
    int idx;
    boolean attend;
    
    Node(int r, int i, boolean a) {
        this.rank = r;
        this.idx = i;
        this.attend = a;
    }
    
}