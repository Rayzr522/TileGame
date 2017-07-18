package me.rayzr522.tilegame;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Rayzr522 on 7/17/17.
 */
public class Window {
    private final JFrame frame;

    private BufferedImage raw;

    public Window(JFrame frame) {
        this.frame = frame;
        this.raw = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
    }

    public Dimension getSize() {
        return frame.getSize();
    }

    public void setPixel(int x, int y, int color) {
        raw.setRGB(x, y, color);
    }

    public void draw() {
        frame.getGraphics().clearRect(0, 0, getWidth(), getHeight());
        frame.getGraphics().drawImage(raw, 0, 22, null);
    }

    public int getWidth() {
        return (int) getSize().getWidth();
    }

    public int getHeight() {
        return (int) getSize().getHeight();
    }
}
