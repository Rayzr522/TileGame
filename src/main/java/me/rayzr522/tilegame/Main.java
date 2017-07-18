package me.rayzr522.tilegame;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Dimension size = new Dimension(800, 600);

        frame.setMinimumSize(size);
        frame.setMaximumSize(size);
        frame.setPreferredSize(size);

        frame.pack();

        frame.setLocationRelativeTo(null);

        TileGame tileGame = new TileGame(new Window(frame), (Graphics2D) frame.getGraphics());

        frame.setVisible(true);

        new Thread(tileGame, "TileGame Main Thread").start();
    }
}
