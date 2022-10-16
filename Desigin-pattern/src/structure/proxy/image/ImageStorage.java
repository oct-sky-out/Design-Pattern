package structure.proxy.image;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ImageStorage {
    Map<String, Image> imageMap = new HashMap<>();

    public void addImage(Image image) {
        this.imageMap.put(image.getImageCode(), image);
    }

    public Optional<Image> searchImage(String imageCode) {
        return Optional.ofNullable(this.imageMap.get(imageCode));
    }
}
