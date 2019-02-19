package com.daemia.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GamePanel extends JPanel implements ActionListener
{

    private int width;
    private int height;

    private Timer timer;

    public GamePanel(int width, int height)
    {
        this.width = width;
        this.height = height;

        timer = new Timer(20, this);
        timer.start();
    }

    private void update()
    {

    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width, height);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        update();
    }
}
