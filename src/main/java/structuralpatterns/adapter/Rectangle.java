package structuralpatterns.adapter;

/**
 * Created by oscar on 16/06/2017.
 */
public class Rectangle {
    public void draw(int x, int y, int width, int height) {
        System.out.println("Rectangle with coordinate left-down point (" + x + ";" + y + "), width: " + width
                + ", height: " + height);
    }
}
