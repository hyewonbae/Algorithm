import  java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        // 각 기능의 배포까지 걸리는 작업일 계산
        for (int i = 0; i < progresses.length; i++) {
            int workdays = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            queue.add(workdays);
        }

        while (!queue.isEmpty()) {
            int deployDay = queue.poll();  // 가장 앞의 작업 배포 기준
            int count = 1;  // 최소 1개의 작업은 배포됨
            // 이후 작업들 중에서 배포 가능하면 함께 배포
            while (!queue.isEmpty() && queue.peek() <= deployDay) {
                queue.poll();
                count++;
            }
            result.add(count);
        }

        return result;
    }
}