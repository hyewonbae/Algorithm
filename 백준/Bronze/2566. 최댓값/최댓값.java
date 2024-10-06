/**
 * 3 23 85 34 17 74 25 52 65
 * 10 7 39 42 88 52 14 72 63
 * 87 42 18 78 53 45 18 84 53
 * 34 28 64 85 12 16 75 36 55
 * 21 77 45 35 28 75 90 76 1
 * 25 87 65 15 28 11 37 28 74
 * 65 27 75 41 7 89 78 64 39
 * 47 47 70 45 23 65 3 41 44
 * 87 13 82 38 31 12 29 29 80
 *
 * 90
 * 5 7
 * */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] map = new int[9][9];
        int maxValue = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] > maxValue) {
                    maxValue = map[i][j];
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }

        System.out.println(maxValue);
        System.out.println(maxRow + " " + maxCol);

        br.close();

    }
}
