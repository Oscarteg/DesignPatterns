package creationalpatterns.factoryMethod.example;

/**
 * Created by oscar on 16/06/2017.
 */
public class Demo {
    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader reader = null;
        String image = args[0];
        String format = image.substring(image.indexOf('.') + 1, (image.length()));
        if (format.equals("gif")) {
            reader = new GifReader(image);
        }
        if (format.equals("jpeg")) {
            reader = new JpegReader(image);
        }
        assert reader != null;
        decodedImage = reader.getDecodedImage();
        System.out.println(decodedImage);
    }
}

