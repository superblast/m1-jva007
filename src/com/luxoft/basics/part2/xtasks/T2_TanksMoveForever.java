package com.luxoft.basics.part2.xtasks;
// comment from idea

import javax.swing.*;
import java.awt.*;

public class T2_TanksMoveForever extends JPanel
{
    int tankX = 0;
    int tankY = 0;

    void runTheGame()
    {
        // TODO YOUR CODE HERE
        String direction = "forward";
        int countOfPlay = 3;
        int currMove = 1;
        while (currMove <= countOfPlay) {
//            moveForward();
            if (tankX >= 512) {
                System.out.println("move back, X is: " + tankX);
                direction = "back";
            }
            else if (tankX <= 64) {
                System.out.println("move forward X is: " + tankX);
                direction = "forward";
            }
            moveToDirection(direction);
        }
    }

    // Magic bellow. Do not worry about this now, you will understand everything in this course.
    // Please concentrate on your tasks only.

    final int BF_WIDTH = 576 + 20;
    final int BF_HEIGHT = 576 + 20;

    public static void main(String[] args) throws Exception
    {
        T2_TanksMoveForever bf = new T2_TanksMoveForever();
        bf.runTheGame();
    }

    public T2_TanksMoveForever() throws Exception
    {
        JFrame frame = new JFrame("MOVE TANK FORWARD");
        frame.setLocation(500, 150);
        frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 22));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
    }

    void moveForward()
    {
        // TODO YOUR CODE HERE
        sleep(500);
        tankX = tankX + 64;
        repaint();
    }

    void moveToDirection(String direction)
    {
        // TODO YOUR CODE HERE
//        direction = "forward";
        int increment = 64;
        int startTankX = tankX;
        sleep(300);
        if (direction == "forward") {
            while (tankX < startTankX + increment) {
                tankX++;
                repaint();
                sleep(3);
                if (tankX % 64 == 0) {
                    sleep(300);
                    System.out.println("Sleep fw " + tankX);
                }
            }
        }
        else if (direction == "back") {
            while (tankX > startTankX - increment + 1) {
                tankX--;
                repaint();
                sleep(3);
                if (tankX % 64 == 0) {
                    sleep(300);
                }
            }
        }
        else {
            System.out.println("Incorrect direction reached");
        }
//        repaint();
    }

    String getTankQuadrant(int x, int y)
    {
        // TODO YOUR CODE HERE
        System.out.println("Coordinates are " + x + " " + y);
        int position_x = x / 64;
        int position_y = y / 64 + 1;
        String input_row_x = "ABCDEFGHI";
        char x_string = input_row_x.charAt(position_x);
        return x_string + "_" + position_y;
    }

    void sleep(int millis)
    {
        try
        {
            Thread.sleep(millis);
        }
        catch (InterruptedException e)
        {

        }
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        paintBF(g);

        g.setColor(new Color(255, 0, 0));
        g.fillRect(tankX, tankY, 64, 64);
    }

    private void paintBF(Graphics g)
    {
        super.paintComponent(g);

        int i = 0;
        Color cc;
        for (int v = 0; v < 9; v++)
        {
            for (int h = 0; h < 9; h++)
            {
                if (i % 2 == 0)
                {
                    cc = new Color(252, 241, 177);
                }
                else
                {
                    cc = new Color(233, 243, 255);
                }
                i++;
                g.setColor(cc);
                g.fillRect(h * 64, v * 64, 64, 64);
            }
        }
    }

}