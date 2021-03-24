import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ImageRender {

    private String lib;
    private BufferedImage img = null;

    public ImageRender(String lib) {
        this.lib = lib;

    }

    public BufferedImage render(String fileName) {

        try {
            img = ImageIO.read(new File(lib + fileName));

        } catch (IOException e) {
            System.out.println(e);

        }
        return img;
    }

    public ArrayList<BufferedImage> giveSprites(BufferedImage spriteSheet, int width, int height ,int spriteSize) {
        ArrayList<BufferedImage> list = new ArrayList<BufferedImage>();
        int x = 0;
        int y = 0;
        int w = spriteSize;
        int h = spriteSize;


        for (int i = 0; i < height; i += spriteSize) {
            System.out.println(i);
            for (int i1 = 0; i1 < width; i1 += spriteSize) {
                BufferedImage img = spriteSheet.getSubimage(x, y, w, h);
                System.out.println(i1 + "i1");
                list.add(img);
             x+=spriteSize;
            }
            x=0;
            y+=spriteSize;
        }


        return list;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

//    public BufferedImage animateSprite(int spriteFrames , int tick){
//
//      return
//    }


}




