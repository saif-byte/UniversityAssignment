import java.awt.*;

public class Brighter {
    public static void main(String[] args) {
        Picture pic= new Picture(args[0]);
        Picture picbright=new Picture(pic.width(),pic.height());
        pic.show();
        for (int x = 0; x < pic.width(); x++) {
            for (int y = 0; y < pic.height(); y++) {
                Color c= pic.get(x,y);

                Color bright=c.brighter();
                picbright.set(x,y,bright);
            }

        }
        picbright.show();
    }
}
