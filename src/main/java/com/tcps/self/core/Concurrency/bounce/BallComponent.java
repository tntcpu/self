package com.tcps.self.core.Concurrency.bounce;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018/02/05 14:40
 **/
public class BallComponent extends JPanel {
    public static final int DEFAULT_WIDTH = 450;
    public static final int DEFAULT_HEIGHT = 350;

    private List<Ball> balls = new ArrayList<>();

    public void add(Ball b) {
        balls.add(b);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Ball b : balls) {
            g2.fill(b.getShape());
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
