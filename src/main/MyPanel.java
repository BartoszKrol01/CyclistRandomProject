package main;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static final Dimension WINDOW_SIZE = new Dimension(800, 600);

    private Cyclist cyclist;

    @Override
    public Dimension getPreferredSize() {
        return WINDOW_SIZE;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(cyclist.getLocationX()-cyclist.getCyclistWidth(), cyclist.getLocationY(), cyclist.getCyclistWidth(), cyclist.getCyclistHeight());
    }

    public MyPanel(Cyclist cyclist) {
        this.cyclist = cyclist;
        setLayout(null);
    }
}