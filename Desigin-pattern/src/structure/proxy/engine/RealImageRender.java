package structure.proxy.engine;

import structure.proxy.image.Image;
import structure.proxy.image.ImageStorage;

public class RealImageRender implements RenderEngine {
    private final ImageStorage imageStorage = new ImageStorage();

    @Override
    public void render(String imageCode) {
        System.out.println("search image " + imageCode);
        this.imageStorage.searchImage(imageCode)
                .ifPresentOrElse(
                        System.out::println,
                        () -> {
                            System.out.println("image is empty, save auto image");
                            this.imageStorage.addImage(new Image(imageCode, imageCode, imageCode.length()));
                        });
        System.out.println("render image " + imageCode);
    }

    @Override
    public void render(Image imageCode) {
        System.out.println("render image " + imageCode);

        System.out.println(imageCode);
    }

    public void addImage(Image image) {
        this.imageStorage.addImage(image);
    }

    ImageStorage getImageStorage() {
        return imageStorage;
    }
}
