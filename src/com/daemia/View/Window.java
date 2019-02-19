package com.daemia.View;

import com.daemia.Controller.GamePanel;
import javax.swing.*;
import java.awt.*;


public class Window extends JFrame
{

    private final int WIDTH = 700;
    private final int HEIGHT = 700;

    public void createWindow()
    {
        this.setTitle("Pong");
        this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        this.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.add(new GamePanel(WIDTH, HEIGHT));
    }

    public int getWIDTH()
    {
        return WIDTH;
    }

    public int getHEIGHT()
    {
        return HEIGHT;
    }
}
