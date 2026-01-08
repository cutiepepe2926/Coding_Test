import java.io.*;
import java.util.*;

public class Main {

    static class BT {
        int key;
        BT left;
        BT right;

        BT(int key) {
            this.key = key;
        }

    }

    static BT add(BT bt, int key) {
        if (bt == null) return new BT(key);

        BT cur = bt;
        while (true) {
            if (key < cur.key) {
                if (cur.left == null) {
                    cur.left = new BT(key);
                    break;
                }
                cur = cur.left;
            }
            else {
                if (cur.right == null) {
                    cur.right = new BT(key);
                    break;
                }
                cur = cur.right;
            }
        }
        return bt;
    }

    static StringBuilder sb = new StringBuilder();

    static void postOrder(BT bt) {
        if (bt == null) return;
        postOrder(bt.left);
        postOrder(bt.right);
        sb.append(bt.key).append("\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        ArrayList<Integer> al = new ArrayList<>();

        while ((s = br.readLine()) != null && !s.isEmpty()) {
            al.add(Integer.parseInt(s));
        }

        BT root = null;

        for (int i = 0; i < al.size(); i++) {
            root = add(root, al.get(i));
        }

        postOrder(root);

        System.out.println(sb);

    }
}