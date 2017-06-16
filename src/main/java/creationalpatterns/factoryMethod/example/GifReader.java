package creationalpatterns.factoryMethod.example;

/**
 * Created by oscar on 16/06/2017.
 */
public class GifReader implements ImageReader {

    private DecodedImage decodedImage;

    public GifReader (String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodedImage() {
        return decodedImage;
    }
}
