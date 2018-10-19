package com.tcps.self.core.Concurrency.bounce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018/02/05 14:39
 **/
public class Bounce {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new BounceFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class BounceFrame extends JFrame {
    private BallComponent comp;
    public static final int STEPS = 10000;
    public static final int DELAY = 3;

    public BounceFrame() {
        setTitle("Bounce");
        comp = new BallComponent();
        add(comp, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel, "Start", event -> addBalll());
        addButton(buttonPanel, "Close", event -> System.exit(0));
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }

    public void addButton(Container c, String title, ActionListener listener) {
        JButton jButton = new JButton(title);
        c.add(jButton);
        jButton.addActionListener(listener);
    }

    public void addBalll() {
        try {
            Ball ball = new Ball();
            comp.add(ball);
            for (int i = 0; i <= STEPS; i++) {
                ball.move(comp.getBounds());
                comp.paint(comp.getGraphics());
                Thread.sleep(DELAY);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
