import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] parent, input;

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine(), " ");
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        parent=new int[N+1];
        input=new int[N+1];

        for(int i=1; i<=N; i++){
            parent[i]=i;
        }

        for(int i=0; i<M; i++){
            st=new StringTokenizer(br.readLine(), " ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            union(a, b);
        }
       
        st=new StringTokenizer(br.readLine(), " ");
        for(int i=1; i<=N; i++){
            input[i]=Integer.parseInt(st.nextToken());
        }

        int count=0;
        for (int i=2; i<=N; i++) {
            if (find(input[i]) != find(input[i-1])) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }

    static boolean union(int i, int j) {
        int iRoot=find(i);
        int jRoot=find(j);
        if(iRoot==jRoot) return false;
        parent[jRoot]=iRoot;
        return true;
    }

    static int find(int k) {
        if (parent[k] == k) return k;
        return parent[k] = find(parent[k]);
    }
}
