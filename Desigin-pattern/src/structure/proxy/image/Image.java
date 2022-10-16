package structure.proxy.image;

public class Image {
    private final String imageCode;
    private final String name;
    private final long size;

    public Image(String imageCode, String name, long size) {
        this.imageCode = imageCode;
        this.name = name;
        this.size = size;
    }

    public String getImageCode() {
        return imageCode;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Image [imageCode=" + imageCode + ", name=" + name + ", size=" + size + "]";
    }

}
