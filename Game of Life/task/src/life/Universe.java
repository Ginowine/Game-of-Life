package life;

import javafx.scene.control.Cell;

import java.util.ArrayList;
import java.util.Random;

public class Universe {


    private int size;
    private int seed;

    public Universe(int size, int seed) {
        this.size = size;
        this.seed = seed;
    }

    public String[][] evolve() {
        String[][] field = new String[size][size];
        Random rng = new Random(seed);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (rng.nextBoolean()) {
                    field[i][j] = "O";
                } else {
                    field[i][j] = " ";
                }
            }
        }
        return field;
    }

    public void printUniverse(String[][] field, int size) {
        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < size; j++) {
                sb.append(field[i][j]);
            }
            System.out.println(sb.toString());
        }
    }
}
