import java.awt.*;

public class App {
    private static final Color[] colors = {Color.black, Color.blue, Color.cyan, Color.magenta, Color.green, Color.red, Color.pink, Color.orange};
    private static final int MAX_SCREEN_X = 10000;
    private static final int MAX_SCREEN_Y = 10000;

    private Pixel[][] image;
    private boolean useFlyweight;

    public App(boolean useFlyweight){
        this.useFlyweight = useFlyweight;
    }

    private Color getRandColor(){
        int index = (int) Math.random() * colors.length;
        return colors[index];
    }

    private int getRandX(){
        return (int) Math.random()*MAX_SCREEN_X;
    }

    private int getRandY(){
        return (int) Math.random()*MAX_SCREEN_Y;
    }

    public void run(){
        image = new Pixel[MAX_SCREEN_X][MAX_SCREEN_Y];
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < MAX_SCREEN_X; i++){
            for(int j = 0; j < MAX_SCREEN_Y; j++) {
                if(useFlyweight){
                    image[i][j] = PixelFactory.getPixel(getRandX(), getRandY(), getRandColor());
                } else {
                    image[i][j] = new Pixel(getRandX(), getRandY(), getRandColor());
                }
            }
        }
        long delta = System.currentTimeMillis() - startTime;
        System.out.println("Took " + delta + " millis.");
    }
}
