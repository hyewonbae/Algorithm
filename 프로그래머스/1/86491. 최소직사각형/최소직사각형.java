import java.io.*;
import java.util.*;

class Solution {
     static int solution(int[][] sizes) {
        int answer = 0;
        int maxRow = 0, maxCol = 0;

        // 가로와 세로중 긴 값을 가로로, 작은 값을 세로로 저장
        // 최대 가로와 최대 세로 값의 곱으로 지갑의 크기를 지정
        for(int[] size:sizes){
            int row = Math.max(size[0], size[1]);
            int col = Math.min(size[0], size[1]);

            maxRow = Math.max(maxRow, row);
            maxCol = Math.max(maxCol, col);

        }
        answer = maxRow*maxCol;
        return answer;
    }
}

/**
 * TEST CASE 1
 * 가로 세로
 * 60  50
 * 70  30
 * 60  30
 * 80  40
 *
 * 80 * 50 = 4000
 *
 * TEST CASE 2
 * 가로 세로
 * 10  7
 * 12  3
 * 15  8
 * 14  7
 * 15  5
 *
 * 15 * 8 = 120
 *
 * TEST CASE 3
 * 가로 세로
 * 14  4
 * 19  6
 * 16  6
 * 18  7
 * 11  7
 *
 * 19 * 7 = 133
 * */