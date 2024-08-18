/**
 * 가로, 세로는 무조건 3이상 (3보다 작으면 yellow 자리가 없다.)
 * yellow 넓이 : (가로-2) * (세로-2)
 * 가로 > 세로
 * */

class Solution {
     /**
     * 갈색 카펫과 노란색 카펫으로
     * 카펫의 가로와 세로 길이를 계산
     * @param b 갈색 타일의 개수
     * @param y 노란색 타일의 개수
     * @return 가로, 세로의 크기
     * */
    
    public int[] solution(int b, int y) {
        int[] answer = new int[2];  // 가로, 세로 크기

        int carpetCnt = b+y;
        int n;

        // 가로 i
        for(int i = 3; i <= (int)Math.sqrt(carpetCnt); i++){
            // carpetCnt의 약수라면
            if(carpetCnt % i == 0){
                n = carpetCnt / i;      // 세로 길이

               // (가로-2) * (세로-2) = 노란색 타일 넓이
               if((i-2)*(n-2) == y){
                   answer[0] = n;
                   answer[1] = i;
               }
            }
        }
        return answer;
    }
}