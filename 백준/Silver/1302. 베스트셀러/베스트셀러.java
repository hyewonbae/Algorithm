import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        List<String> keySet = new ArrayList<>(map.keySet());

        keySet.sort((o1, o2) -> {
            int compareResult = map.get(o2).compareTo(map.get(o1));
            if (compareResult == 0) {
                return o1.compareTo(o2);
            }
            return compareResult;
        });
        System.out.println(keySet.get(0));
    }
}
