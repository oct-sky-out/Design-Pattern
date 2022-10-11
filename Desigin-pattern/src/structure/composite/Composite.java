package structure.composite;

import java.util.ArrayList;
import java.util.List;

import structure.composite.inter.Component;

public class Composite implements Component {
  private final List<Component> children = new ArrayList<>();
  private final String dirName;
  private final int deps;

  public Composite(String dirName, int deps) {
    this.dirName = dirName;
    this.deps = deps;
  }

  public void addChild(Component component) {
    this.children.add(component);
  }

  public void addAllChild(List<Component> component) {
    this.children.addAll(component);
  }

  private Component removeChild(Component component) {
    this.children.remove(component);
    return component;
  }

  private List<Component> getChildren() {
    return this.children;
  }

  public int getDeps() {
    return deps;
  }

  @Override
  public void execute() {
    System.out.println(this.dirName);
    children.forEach(t -> {
      System.out.println("\t".repeat(deps) + "|");
      System.out.print("\t".repeat(deps) + "-".repeat(4));
      t.execute();
    });
  }
}
