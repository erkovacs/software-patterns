public class PrototypeMain {
    public static void main(String[] args){
        CloneFactory imageFactory = new CloneFactory();
        // 3 * 3 checkered pattern
        short[][] image = {{255, 0, 255},
                           {0, 255, 0},
                           {255, 0, 255}};
        BitmapImage bmp = new BitmapImage(image);
        BitmapImage bmp2 = (BitmapImage) imageFactory.getClone(bmp);

        System.out.println("First image");
        System.out.println(bmp);
        System.out.println("Address: " + System.identityHashCode(bmp));
        System.out.println("\nCloned image");
        System.out.println(bmp);
        System.out.println("Address: " + System.identityHashCode(bmp2));
    }
}
