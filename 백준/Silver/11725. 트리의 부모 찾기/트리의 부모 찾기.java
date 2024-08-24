/**
 * 7
 * 1 6
 * 6 3
 * 3 5
 * 4 1
 * 2 4
 * 4 7
 *
 * 4
 * 6
 * 1
 * 3
 * 1
 * 4
 * */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();

       ArrayList<ArrayList<Integer>> list=new ArrayList<>();
       for(int i=0;i<=n;i++){
           list.add(new ArrayList<>());
       }
       for(int i=0;i<n-1;i++){
           int n1=sc.nextInt();
           int n2=sc.nextInt();
           list.get(n1).add(n2);
           list.get(n2).add(n1);
       }

       boolean[] visited = new boolean[n+1];
       int[] parentNode =new int[n+1];

       ArrayDeque<Integer> queue = new ArrayDeque<>();
       queue.add(1);
       visited[1]=true;

       while(!queue.isEmpty()){
           int v =queue.poll();
           for(int node : list.get(v)){
               if(!visited[node]){
                   visited[node]=true;
                   queue.add(node);
                   parentNode[node]=v;
               }
           }
       }

       for(int i=2;i<=n;i++){
           System.out.println(parentNode[i]);
       }
       sc.close();
    }
}
