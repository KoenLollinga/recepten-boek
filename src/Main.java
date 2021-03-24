import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;


public class Main {

    public static void main(String[] args) {
      ButtonManager  buttonManager = new ButtonManager();
        boolean notClosed = true;
        final String title = "Supersnele nieuwe pc";
        //screen size
        final int width = 1000, height = 700;

        MouseListener mListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int mouseY = e.getY();
                int mouseX = e.getX();
                buttonManager.setMouseX(mouseX);
                buttonManager.setMouseX(mouseY);

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };


        //new frame

        JFrame frame = new JFrame();

        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        // new canvas

        Canvas canvas = new Canvas();

        canvas.setSize(width, height);
        canvas.setBackground(Color.white);
        canvas.setVisible(true);
        canvas.setFocusable(false);
        canvas.addMouseListener(mListener);


        frame.add(canvas);


        canvas.createBufferStrategy(3);

        boolean running = true;
        Graphics g;
        Integer screen =0;
        Integer checkScreen =0;


        BufferStrategy bufferStrategy;
        bufferStrategy = canvas.getBufferStrategy();
        g = bufferStrategy.getDrawGraphics();
       Draw draw = new Draw(g);
        g.clearRect(0, 0, width, height);
        int tick = 0;


            while (running) {
                bufferStrategy = canvas.getBufferStrategy();
                g = bufferStrategy.getDrawGraphics();
                g.clearRect(0, 0, width, height);

                draw.render(screen);
                tick++;



//            check of screen verandert is
                if (checkScreen != screen) {
                    screen = checkScreen;
                    buttonManager.setActiveScreen(screen);
                }
                checkScreen = buttonManager.handleClicked(screen);

                System.out.println(tick);


                bufferStrategy.show();
                g.dispose();

            }


        }



}

