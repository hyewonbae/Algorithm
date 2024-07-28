class Solution {

    /**
     * 주어진 컴퓨터 배열을 바탕으로 네트워크의 수를 구하는 메소드
     * @param n 컴퓨터의 총 개수
     * @param computers 인접 행렬
     * @return 네트워크의 수
     */
    public int solution(int n, int[][] computers) {
        int answer=0;
        boolean[] v=new boolean[n];

        for(int i=0;i<n;i++){
            if(!v[i]){
                answer++;
                dfs(i,v,computers);
            }
        }
        return answer;
    }
    
    /**
     * 깊이 우선 탐색을 수행하여 연결된 컴퓨터를 모두 방문하는 메소드
     * @param node 현재 노드
     * @param visited 방문 여부 배열
     * @param computers 인접 행렬
     */
     static void dfs(int node, boolean[] v, int[][] computers) {
        v[node] = true;
        for(int i=0;i<computers.length;i++){
            if(!v[i] && computers[node][i] == 1){
                dfs(i,v,computers);
            }
        }
    }
}