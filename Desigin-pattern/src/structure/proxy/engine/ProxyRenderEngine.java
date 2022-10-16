package structure.proxy.engine;

import java.util.Arrays;
import java.util.Objects;

import structure.proxy.image.Image;

public class ProxyRenderEngine implements RenderEngine {
    public static final int IMAGE_CHACHE_SIZE = 3;
    private Image[] images = new Image[] { null, null, null };
    private RenderEngine imageRenderEngine;

    @Override
    public void render(String imageCode) {
        if (Objects.isNull(this.imageRenderEngine)) {
            this.imageRenderEngine = new RealImageRender();
        }

        lruImageCahceing(imageCode);
    }

    @Override
    public void render(Image image) {
        imageRenderEngine.render(image);
    }

    private void lruImageCahceing(String imageCode) {
        if (Objects.nonNull(images[2])) {
            for (Image image : images) {
                if (Objects.equals(image.getImageCode(), imageCode)) {
                    render(image);
                    cacheing(image);
                    showlru();
                    return;
                }
            }
        }

        ((RealImageRender) imageRenderEngine).getImageStorage()
                .searchImage(imageCode)
                .ifPresent(this::cacheing);
        imageRenderEngine.render(imageCode);
        showlru();
    }

    private void cacheing(Image image) {
        if (Objects.nonNull(images[2])) {
            images = new Image[] { images[1], images[2], image };
            return;
        }

        for (int i = 0; i < images.length; i++) {
            if (Objects.isNull(images[i])) {
                images[i] = image;
                break;
            }
        }
    }

    private void showlru() {
        System.out.println("--------------LRU--------------");
        Arrays.asList(images).forEach(System.out::println);
        System.out.println("-------------------------------");
    }
}
