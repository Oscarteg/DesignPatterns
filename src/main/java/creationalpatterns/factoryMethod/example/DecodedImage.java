package creationalpatterns.factoryMethod.example;

/**
 * Created by oscar on 16/06/2017.
 */
public class DecodedImage {

    private String image;

    public DecodedImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return image + ": is decoded";
    }
}
