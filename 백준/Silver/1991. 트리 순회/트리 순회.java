import java.io.*;
import java.util.*;

public class Main {

    static Node[] tree;

    static class Node{
        String left;
        String right;

        Node(String left, String right) {
            this.left = left;
            this.right = right;
        }
    }

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        tree = new Node[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String left = st.nextToken();
            String right = st.nextToken();
            tree[key.charAt(0) - 'A'] = new Node(left, right);
        }

        preOrder(tree, 0);
        sb.append("\n");
        inOrder(tree,0);
        sb.append("\n");
        postOrder(tree,0);
        sb.append("\n");

        System.out.println(sb);

    }

    static void preOrder(Node[] t, int idx) {
        sb.append( (char) ('A' + idx) );
        if (!t[idx].left.equals(".")) preOrder(t, t[idx].left.charAt(0) - 'A');
        if (!t[idx].right.equals(".")) preOrder(t, t[idx].right.charAt(0) - 'A');
    }
    static void inOrder(Node[] t, int idx) {
        if (!t[idx].left.equals(".")) inOrder(t, t[idx].left.charAt(0) - 'A');
        sb.append((char) ('A' + idx) );
        if (!t[idx].right.equals(".")) inOrder(t, t[idx].right.charAt(0) - 'A');
    }
    static void postOrder(Node[] t, int idx) {
        if (!t[idx].left.equals(".")) postOrder(t, t[idx].left.charAt(0) - 'A');
        if (!t[idx].right.equals(".")) postOrder(t, t[idx].right.charAt(0) - 'A');
        sb.append((char) ('A' + idx) );
    }
}