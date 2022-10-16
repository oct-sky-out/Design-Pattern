package structure.proxy;

import java.util.UUID;

import structure.proxy.engine.ProxyRenderEngine;
import structure.proxy.engine.RenderEngine;

public class Main {
    public static void main(String[] args) {
        RenderEngine engine = new ProxyRenderEngine();

        String image1 = UUID.randomUUID().toString() + "first";
        String image2 = UUID.randomUUID().toString() + "second";
        String image3 = UUID.randomUUID().toString() + "third";
        String image4 = UUID.randomUUID().toString() + "fourth";

        engine.render(image1);
        engine.render(image1);
        engine.render(image2);
        engine.render(image2);
        engine.render(image3);
        engine.render(image3);
        engine.render(image1);
        engine.render(image4);
        engine.render(image4);
    }
}
