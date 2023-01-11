package main;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MyFrame(MyPanel panel) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }

}
