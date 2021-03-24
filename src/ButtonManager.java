

import java.util.ArrayList;

public class ButtonManager {
    private InvisButton test;
    private ArrayList<InvisButton> allButtons, activeButtons;
    private int mouseX, mouseY;


    public ButtonManager() {
        // maak alle buttons over de foto's

        allButtons = new ArrayList<InvisButton>();


    }

    //  set de juiste knoppen actief
    public void setActiveScreen(Integer screen) {
        switch (screen) {
// change active buttons to screen
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
             break;

        }

    }

    //doe de actie als op actieve knop geklikt
    public Integer handleClicked(int screen) {


        switch (screen) {
// button handle
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:


        }
        return screen;
    }

    public void setAllButtonsUnactive() {
        int x = allButtons.size();
        for (int i = 0; i < x; i++) {
            if (allButtons.get(i).getState()) {
                allButtons.get(i).setUnactive();
            }
        }

    }

    private void setActiveButtons() {
        int x = allButtons.size();
        for (int i = 0; i < x; i++) {
            if (allButtons.get(i).getState()) {
                activeButtons.add(allButtons.get(i));
            }
        }
    }

    public int getMouseX() {
        return mouseX;
    }

    public void setMouseX(int mouseX) {
        this.mouseX = mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }

    public void setMouseY(int mouseY) {
        this.mouseY = mouseY;
    }

    public void resetMouse() {
        mouseX = -1;
        mouseY = -1;
    }

}

