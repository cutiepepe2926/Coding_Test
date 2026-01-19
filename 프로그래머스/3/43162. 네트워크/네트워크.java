class Solution {
    
    static int x;
    static int[][] network;
    static boolean[] visited;
    static void bfs(int start) {
        visited[start] = true;
        for (int v = 0; v < x; v++) {
            if (network[start][v] == 1 && !visited[v]) {
                bfs(v);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        network = computers;
        x=n;
        int answer = 0;
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(i);
                answer++;
            }
        }
        return answer;
    }
}