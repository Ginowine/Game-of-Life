import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int maxNum;
        int minMax = k;
        int seed = 0;

        for (int i = a; i <= b; i++) {
            Random random = new Random(i);
            maxNum = 0;
            for (int j = 0; j < n; j++) {
                int num = random.nextInt(k);
                if (num > maxNum) {
                    maxNum = num;
                }
            }
            if (minMax > maxNum) {
                minMax = maxNum;
                seed = i;
            }
        }

        System.out.println(seed);
        System.out.println(minMax);
    }
}