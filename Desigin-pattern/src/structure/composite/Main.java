package structure.composite;

import java.util.List;

import structure.composite.inter.Component;

public class Main {
  public static void main(String[] args) {
    Composite root = new Composite("root", 0);

    // create "design-pattern" directory and add pattern categories
    Composite designPattern = createComposite("design-pattern", root.getDeps() + 1);
    designPattern.addAllChild(List.of(createLeaf("creational"), createLeaf("structure")));

    // create "behavior" category and add behavior pattern names
    Composite behavior = createComposite("behavior", designPattern.getDeps() + 1);
    behavior.addAllChild(List.of(createLeaf("command-pattern"), createLeaf("iterator-pattern"),
        createLeaf("observe-pattern"), createLeaf("visitor-pattern")));

    // after add at dir1 last child
    designPattern.addChild(behavior);

    root.addChild(designPattern);
    root.execute();
  }

  public static Composite createComposite(String dirName, int deps) {
    return new Composite(dirName, deps);
  }

  public static Component createLeaf(String fileName) {
    return new Leaf(fileName);
  }
}
