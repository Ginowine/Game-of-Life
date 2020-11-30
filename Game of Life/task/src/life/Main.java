package life;

import javafx.scene.control.Cell;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int size = sc.nextInt();
        final int seed = sc.nextInt();
        final int numberOfGenerations = sc.nextInt();
        sc.close();

        Universe universe = new Universe(size, seed);
        String[][] field = universe.evolve();


        GenerationAlgorithm algo = new GenerationAlgorithm(field);
        for (int i = 0; i < numberOfGenerations; i++) {
            field = algo.calculateNextGeneration();
        }

        universe.printUniverse(field, size);
    }
}
