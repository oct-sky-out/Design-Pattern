package structure.composite;

import structure.composite.inter.Component;

public class Leaf implements Component {
  private final String fileName;

  public Leaf(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void execute() {
    System.out.println(this.fileName);
  }
}