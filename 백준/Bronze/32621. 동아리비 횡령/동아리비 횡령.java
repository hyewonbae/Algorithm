import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();  // 공백 제거

        if (!str.contains("+")) {
            System.out.println("No Money");
            return;
        }

        // "+" 기준으로 문자열을 두 부분으로 분리
        String[] parts = str.split("\\+");

        // 두 부분으로 나눌 수 없거나 그 외 조건을 만족하지 않으면 "No Money"
        if (parts.length != 2) {
            System.out.println("No Money");
            return;
        }

        String firstPart = parts[0];
        String secondPart = parts[1];

        // 두 부분이 숫자인지, 그리고 동일하며 0으로 시작하지 않는지 확인
        if (isNumeric(firstPart) && isNumeric(secondPart) 
            && firstPart.equals(secondPart) && !firstPart.startsWith("0")) {
            System.out.println("CUTE");
        } else {
            System.out.println("No Money");
        }
        br.close();
    }

    // 숫자 여부 확인 메서드
    private static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
