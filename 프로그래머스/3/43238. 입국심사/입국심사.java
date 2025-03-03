import java.io.*;
import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
         Arrays.sort(times);
        long start = 1;
        long end = n*(long)times[times.length-1];
        long ans = end;

        while(start <= end){
            long mid = (start+end) / 2;
            long total = 0;

            for(int time : times){
                total += mid / time;
            }

            if(total >= n){
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return ans;
    }
}