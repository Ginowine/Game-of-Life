import java.util.Scanner;

public class Main {

    public static int convert(Long val) {
        // write your code here
        if (val == null){
            return 0;
        }else if (val > Integer.MAX_VALUE){
            int a = (int)2147483647;
            return a;
        }else if (val < Integer.MIN_VALUE){
            int b = (int)-2147483648;
            return b;
        }else {
            return val.intValue();
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}