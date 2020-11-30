package life;

import java.util.Arrays;
import java.util.Random;

public class GenerationAlgorithm {
    private String[][] field;

    public GenerationAlgorithm(String[][] field) {
        this.field = field;
    }

    public String[][] calculateNextGeneration() {
        String[][] oldField = Arrays.stream(this.field).map(String[]::clone).toArray(String[][]::new);
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                int countOfNeighbors = countNeighbors(oldField, i, j);
                if (oldField[i][j] == " " && countOfNeighbors == 3) {
                    this.field[i][j] = "O";
                } else if (oldField[i][j] == "O" && (countOfNeighbors < 2 || countOfNeighbors > 3)) {
                    this.field[i][j] = " ";
                }
            }
        }
        return this.field;
    }

    private int countNeighbors(String[][] oldField, int row, int column) {
        int neighbors = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (oldField[(field.length+row+i)%field.length][(field.length+column+j)%field.length] == "O" && (i!=0 || j!=0)) {
                    neighbors++;
                }
            }
        }
        return neighbors;
    }
}
