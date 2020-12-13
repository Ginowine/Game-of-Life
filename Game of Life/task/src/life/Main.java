package life;

import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws InterruptedException {
//        Scanner sc = new Scanner(System.in);
//        final int size = sc.nextInt();
//        final int seed = sc.nextInt();
//        final int numberOfGenerations = sc.nextInt();
//        sc.close();
//
//        Universe universe = new Universe(size, seed);
//        String[][] field = universe.evolve();
//
//
//        GenerationAlgorithm algo = new GenerationAlgorithm(field);
//        for (int i = 0; i < numberOfGenerations; i++) {
//            field = algo.calculateNextGeneration();
//        }
//
//        universe.printUniverse(field, size);
        Scanner scanner = new Scanner(System.in);
        int universeSize = scanner.nextInt();
        final int generations = 11;
        scanner.close();
        Universe universe = new Universe(universeSize).initialise();
        for (int i = 0; i < generations; ++i) {
            System.out.printf("Generation #%d%nAlive: %d%n", universe.getGeneration(),
                    universe.getAliveCount());
            universe.printMap();
            universe.nextGeneration();
            Thread.sleep(1000);
            clearScreen();
        }
    }
    static void clearScreenOld() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
