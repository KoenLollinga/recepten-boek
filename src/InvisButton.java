import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InvisButton {

    private int x, y, butX = 150, butY = 400, width = 60, height = 30,savedWidth,savedHeight;

    public InvisButton(int butX, int butY) {
        this.butX = butX;
        this.butY = butY;
    }

    public Boolean buttonClicked() {
        boolean b = butX < x && x < (butX + width) && butY < y && y < (butY + height);
        setClicked(-1, -1);
        return b;
    }

    public void setClicked(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public void setUnactive(){
        savedHeight = height;
        savedWidth = width;
        width=0;
        height=0;
    }
    public void setActive(){
        width = savedWidth;
        height = savedHeight;
    }
    public  Boolean  getState(){
        if (width >0 && height >0){
            return true;
        }else{
            return false;
        }
    }


    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public void setButX(int butX) {
        this.butX = butX;
    }

    public void setButY(int butY) {
        this.butY = butY;
    }



    public void test() {
        System.out.println(x + " " + y);
    }


}
