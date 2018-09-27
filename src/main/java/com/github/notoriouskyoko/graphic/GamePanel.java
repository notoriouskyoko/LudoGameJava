package com.github.notoriouskyoko.graphic;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect (0, 0, 380, 380);
        g.setColor(Color.RED);


    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }



}
