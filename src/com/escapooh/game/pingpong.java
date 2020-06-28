package com.escapooh.game;


import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Rectangle;

import java.awt.event.MouseEvent;

import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class pingpong extends JFrame implements Runnable, MouseMotionListener
{

    public static final int WIDTH = 1200;
    private static final Random random = new Random();
    public static final int HEIGHT = 800;

    private MyDrawingSurface screen;

    private pingpong pinpong;

    private int mouseX, mouseY;
    
    private int Score = 0;
    
    JLabel backLabel = new JLabel(new ImageIcon(new ImageIcon("images/win.png").getImage().getScaledInstance(1200, 800, 0))); 

    public void init()
    {
        setSize(WIDTH, HEIGHT);
        add(backLabel);

        pinpong = new pingpong();

        add(pinpong);

        addMouseMotionListener(this);
        setTitle("pingpong");

    }

    public pingpong()
    {

        setTitle("PingPongGame");

        setSize(WIDTH + 20, HEIGHT);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        screen = new MyDrawingSurface();

        add(screen, BorderLayout.CENTER);

        addMouseMotionListener(this);
    }

    public void run()
    {

    	int delay = 1 * random.nextInt(10);
    	while (true)
        {

            try
            {
                Ball b = screen.basket[0];
                {
                    Rectangle rectComputer = new Rectangle(0, b.y, 10, 1000);
                    Rectangle rectPlayer = new Rectangle(screen.getWidth() - 10, mouseY, 10, 300);

                    if (rectComputer.intersects(new Rectangle(b.x, b.y, b.diameter, b.diameter)))
                    {
                        //System.out.println("Compter");
                        b.XInc = -b.XInc;
                    }

                    if (rectPlayer.intersects(new Rectangle(b.x, b.y, b.diameter, b.diameter)))
                    {
                        System.out.println("Player");
                        b.XInc = -b.XInc;
                        Score += 10;
                        System.out.println(Score);
                    }

                    if (b.x > screen.getWidth())
                    {                                               
                        break;
                    }

                    if (b.y < 0 || b.y > (screen.getHeight() - b.diameter))
                    {
                        b.YInc = -b.YInc;
                    }

                    b.x += b.XInc;

                    b.y += b.YInc;
                }

                Thread.sleep(delay);
            }
            catch (InterruptedException e)
            {
            }

            repaint();
        }
        while (true)
        {

            try
            {
                Ball b = screen.basket[1];
                {
                    Rectangle rectComputer = new Rectangle(0, b.y, 10, 1000);
                    Rectangle rectPlayer = new Rectangle(screen.getWidth() - 10, mouseY, 10, 300);

                    if (rectComputer.intersects(new Rectangle(b.x, b.y, b.diameter, b.diameter)))
                    {
                        System.out.println("Compter");
                        b.XInc = -b.XInc;
                    }

                    if (rectPlayer.intersects(new Rectangle(b.x, b.y, b.diameter, b.diameter)))
                    {
                        System.out.println("Player");
                        b.XInc = -b.XInc;
                    }

                    if (b.x > screen.getWidth())
                    {                                               
                        break;
                    }

                    if (b.y < 0 || b.y > (screen.getHeight() - b.diameter))
                    {
                        b.YInc = -b.YInc;
                    }

                    b.x += b.XInc;

                    b.y += b.YInc;
                }

                Thread.sleep(delay);
            }
            catch (InterruptedException e)
            {
            }

            repaint();
        }
        while (true)
        {

            try
            {
                Ball b = screen.basket[2];
                {
                    Rectangle rectComputer = new Rectangle(0, b.y, 10, 1000);
                    Rectangle rectPlayer = new Rectangle(screen.getWidth() - 10, mouseY, 10, 300);

                    if (rectComputer.intersects(new Rectangle(b.x, b.y, b.diameter, b.diameter)))
                    {
                        System.out.println("Compter");
                        b.XInc = -b.XInc;
                    }

                    if (rectPlayer.intersects(new Rectangle(b.x, b.y, b.diameter, b.diameter)))
                    {
                        System.out.println("Player");
                        b.XInc = -b.XInc;
                    }

                    if (b.x > screen.getWidth())
                    {                                               
                        break;
                    }

                    if (b.y < 0 || b.y > (screen.getHeight() - b.diameter))
                    {
                        b.YInc = -b.YInc;
                    }

                    b.x += b.XInc;

                    b.y += b.YInc;
                }

                Thread.sleep(delay);
            }
            catch (InterruptedException e)
            {
            }

            repaint();
        }
        while (true)
        {

            try
            {
                Ball b = screen.basket[3];
                {
                    Rectangle rectComputer = new Rectangle(0, b.y, 10, 1000);
                    Rectangle rectPlayer = new Rectangle(screen.getWidth() - 10, mouseY, 10, 300);

                    if (rectComputer.intersects(new Rectangle(b.x, b.y, b.diameter, b.diameter)))
                    {
                        System.out.println("Compter");
                        b.XInc = -b.XInc;
                    }

                    if (rectPlayer.intersects(new Rectangle(b.x, b.y, b.diameter, b.diameter)))
                    {
                        System.out.println("Player");
                        b.XInc = -b.XInc;
                    }

                    if (b.x > screen.getWidth())
                    {                                               
                        break;
                    }

                    if (b.y < 0 || b.y > (screen.getHeight() - b.diameter))
                    {
                        b.YInc = -b.YInc;
                    }

                    b.x += b.XInc;

                    b.y += b.YInc;
                }

                Thread.sleep(delay);
            }
            catch (InterruptedException e)
            {
            }

            repaint();
        }
        while (true)
        {

            try
            {
                Ball b = screen.basket[4];
                {
                    Rectangle rectComputer = new Rectangle(0, b.y, 10, 1000);
                    Rectangle rectPlayer = new Rectangle(screen.getWidth() - 10, mouseY, 10, 300);

                    if (rectComputer.intersects(new Rectangle(b.x, b.y, b.diameter, b.diameter)))
                    {
                        System.out.println("Compter");
                        b.XInc = -b.XInc;
                    }

                    if (rectPlayer.intersects(new Rectangle(b.x, b.y, b.diameter, b.diameter)))
                    {
                        System.out.println("Player");
                        b.XInc = -b.XInc;
                    }

                    if (b.x > screen.getWidth())
                    {                                               
                        break;
                    }

                    if (b.y < 0 || b.y > (screen.getHeight() - b.diameter))
                    {
                        b.YInc = -b.YInc;
                    }

                    b.x += b.XInc;

                    b.y += b.YInc;
                }

                Thread.sleep(delay);
            }
            catch (InterruptedException e)
            {
            }

            repaint();
        }
       
        JOptionPane.showMessageDialog(this, "Game Over");
       
        //System.exit(0);
    }

    public static void main(String[] args)
    {

        Thread aThread;

        aThread = new Thread(new pingpong());

        aThread.start();

    }

    class Ball
    {

        int x, y, XInc = 1, YInc = 1;

        int diameter;

        public Ball(int d)
        {
            this.diameter = d;

            x = (int) (Math.random() * (pingpong.WIDTH - d));

            y = (int) (Math.random() * (pingpong.HEIGHT - d));

            XInc = (int) -(Math.random() * 10 + 1);

            YInc = (int) (Math.random() * 10 + 1);

        }

        public void paint(Graphics g)
        {
            g.setColor(Color.RED);

            g.fillOval(x, y, diameter, diameter);

        }

    }

    class MyDrawingSurface extends JComponent
    {

        public Ball basket[] = new Ball[5];

        public MyDrawingSurface()
        {
            setSize(400, 400);
            for (int i = 0; i <= 4; i++)
            {
                basket[i] = new Ball(20);
            }

        }

        public void paint(Graphics g)
        {

            super.paint(g);

            for (Ball b : basket)
            {
                b.paint(g);
            }

            g.setColor(Color.GREEN);
           
            g.fill3DRect(getWidth() - 10, mouseY, 10, 300, true);
            //g.fill3DRect(0, basket[0].y, 10, 300, true);

        }

    }

    @Override

    public void mouseDragged(MouseEvent e)
    {

        mouseX = e.getX();

        mouseY = e.getY();

    }

    @Override

    public void mouseMoved(MouseEvent e)
    {

        mouseX = e.getX();

        mouseY = e.getY();

    }

}


