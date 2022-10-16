package structure.proxy.engine;

import structure.proxy.image.Image;

public interface RenderEngine {
    void render(String imageCode);

    void render(Image image);
}
