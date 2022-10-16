package structure.flyweight.forest;

import java.util.ArrayList;
import java.util.List;

import structure.flyweight.trees.Tree;
import structure.flyweight.trees.TreeType;
import structure.flyweight.trees.TreeTypeFactory;

public class Forest {
    List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color) {
        TreeType treeType = TreeTypeFactory.getTreeType(name, color);
        trees.add(new Tree(x, y, treeType));
    }

    public List<Tree> getTrees() {
        return trees;
    }

}
