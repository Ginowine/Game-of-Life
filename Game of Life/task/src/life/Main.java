package life;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        Random random = new Random(s);

        String[] [] matrix = new String[n][n];
        for (int r = 0; r < matrix.length; r++){
            for (int c = 0; c < matrix[r].length; c++){
                if (random.nextBoolean()){
                    System.out.print(matrix[r][c] = "O");
                }else {
                    System.out.print(matrix[r][c] = " ");
                }
            }
            System.out.println();
        }
    }
}
