package structure.flyweight;

import java.util.stream.IntStream;

import structure.flyweight.forest.Forest;

public class Main {
    public static final int TREE_COUNT = 1000000;
    public static final int TREE_TYPE_COUNT = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();

        IntStream.range(0, TREE_COUNT)
                .forEach(i -> forest.plantTree(
                        (int) (Math.random() * 100),
                        (int) (Math.random() * 100),
                        i % 2 == 0 ? "pine" : "oak",
                        i % 2 == 0 ? "green" : "light green"));

        System.out.println("Tree creation count = " + TREE_COUNT);
        System.out.println("Tree memory = " + TREE_COUNT * 8 + "byte");
        System.out.println("TreeType memory = " + TREE_TYPE_COUNT * 48 + "byte");
        System.out.println("total memory = " + ((TREE_COUNT * 8 + TREE_TYPE_COUNT * 48) / 1024 / 1024) + "MB");
    }
}
