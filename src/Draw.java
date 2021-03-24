import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Draw {
    private ImageRender imageRender;
    private Integer screen;
    private Integer mouseX,mouseY;



    private BufferedImage imgBackground;
    private Graphics g;
    private ArrayList<Object> objects;
    private String lib = "";




    public Draw(Graphics g) {
        this.g = g;
        imageRender = new ImageRender(lib);

    }

    public void render(Integer screen) {

        switch (screen) {
            //title screen
            case 0:
                //startscreen


                break;
            case 1:
                // regels

                break;
            case 2:

                break;
            case 3:
                //sucsess page

                break;
            case 4:


                break;
        }



    }




    public void setMouseX(Integer mouseX) {
        this.mouseX = mouseX;
    }

    public void setMouseY(Integer mouseY) {
        this.mouseY = mouseY;
    }
}
