import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);

        for (String operation : operations) {
            String token = operation.split(" ")[0];
            int value = Integer.parseInt(operation.split(" ")[1]);

            // 빈 큐에 데이터를 삭제하라는 연산이 주어질 경우, 해당 연산은 무시
            if(minHeap.isEmpty() && token.equals("D")) {
                continue;
            }

            if(token.equals("I")){
                minHeap.offer(value);
                maxHeap.offer(value);

            } else if(token.equals("D")){
                if (value == 1){
                    int max = maxHeap.poll();
                    minHeap.remove(max);
                    // continue;

                } else if(value == -1){
                    int min = minHeap.poll();
                    maxHeap.remove(min);
                    // continue;
                }
            }
            // System.out.println("min" + " " + minHeap);
            // System.out.println("max" + " " +maxHeap);
        }
        if(minHeap.isEmpty()){
            answer[0] = 0;
            answer[1] = 0;
        } else{
            answer[0]=maxHeap.peek();
            answer[1]=minHeap.peek();
        }

        return answer;
    }
}