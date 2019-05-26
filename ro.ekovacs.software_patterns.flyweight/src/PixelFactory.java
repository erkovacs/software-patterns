import java.awt.*;
import java.util.HashMap;

public class PixelFactory {
    private static final HashMap<Color, Pixel> map = new HashMap<>();

    public static Pixel getPixel(int x, int y, Color color){
        Pixel pixel = map.get(color);
        if(pixel == null){
            pixel = new Pixel(x, y, color);
            map.put(color, pixel);
        }
        pixel.setX(x);
        pixel.setY(y);
        return pixel;
    }
}
