public class BitmapImage implements Image {

    private short[][] array;

    public BitmapImage(short[][] array) {
        this.array = array;
    }

    @Override
    public Image makeCopy() {
        BitmapImage bitmapImage = null;
        try {
            bitmapImage = (BitmapImage) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return bitmapImage;
    }

    @Override
    public String toString() {
        String retval = "";
        for(short[] i : array){
            for(short j : i){
                retval += "[" + j + "]";
            }
            retval += "\n";
        }
        return retval;
    }
}
