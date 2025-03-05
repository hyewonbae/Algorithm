import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] ans = new int[2];
        int sum = 0;
        int left = 0;
        int right = 0;
        int size = sequence.length;
        for(right=0; right<sequence.length; right++){
            sum+=sequence[right];
            while(right<sequence.length && sum > k){
                sum-=sequence[left];
                left++;
            }
            if(sum==k){
                if(size > right-left){
                    size = right-left;
                    ans[0] = left;
                    ans[1] = right;
                }
            }
        }
        return ans;
    }
}