package structure.flyweight.trees;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TreeTypeFactory {
    private static Map<String, TreeType> treeTypeMap = new HashMap<>();

    public static TreeType getTreeType(String name, String color) {
        TreeType type = treeTypeMap.get(name);

        if (Objects.isNull(type)) {
            TreeType treeType = new TreeType(name, color);
            treeTypeMap.put(name, treeType);

            return treeType;
        }

        return type;
    }
}
