import java.util.*; 

class Solution {
     /**
     * 우선순위 큐 PriorityQueue 를 사용
     * @param scoville 모든 음식의 스코빌 지수 배열
     * @param K 스코빌 지수
     * return 섞어야 하는 최소 횟수 count
     * */
    static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 스코빌 지수 배열을 우선순위 큐 pq에 저장
        for( int sco : scoville){
            pq.add(sco);
        }

        // count 초기화
        int count = 0;

        // pq가 최소 2개 이상일 때 최소값이 K보다 작으면 반복 , 즉 pq의 최소값이 K면 종료
        while(pq.size() > 1 && pq.peek() < K) {
            int min = pq.peek();
            pq.poll();
            int min2 = pq.peek();
            pq.poll();
            int scoNum = min+(min2*2);
            pq.add(scoNum);         // 섞은 스코빌 지수를 다시 큐에 담기
            count ++;               // 횟수 증가
        }
        if(pq.size() <= 1 && pq.peek() < K){
            return -1;
        }
        return count;
    }

}