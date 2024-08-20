import java.io.*;
import java.util.*;

/**
 * 3 5
 * 1 2 4
 * 2 3 4 5 6
 *
 * 4
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<Integer> n_set = new HashSet<>();
        Set<Integer> m_set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            n_set.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            m_set.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> diff_nm = new HashSet<>(n_set);
        Set<Integer> diff_mn = new HashSet<>(m_set);

        diff_nm.removeAll(m_set);
        diff_mn.removeAll(n_set);

        System.out.println(diff_nm.size()+diff_mn.size());

    }
}
