import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here

        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = Double.parseDouble(scanner.nextLine());
        boolean check;

        Random random = new Random(k);
        for (int i = k; i < n; i++){
            if (m <= random.nextGaussian()){
                k++;
                System.out.println(i);
            }
        }

    }
}