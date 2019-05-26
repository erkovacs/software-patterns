import java.awt.*;

public class FlyweightMain {

    public static void main(String[] args){
        App app = new App(false);
        app.run();
        App app2 = new App(true);
        app2.run();
    }
}
