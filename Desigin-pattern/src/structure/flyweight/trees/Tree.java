package structure.flyweight.trees;

public class Tree { // 32byte
    private final int x; // 4byte
    private final int y; // 4byre
    private final TreeType treeType; // 24byte

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public TreeType getTreeType() {
        return treeType;
    }
}
