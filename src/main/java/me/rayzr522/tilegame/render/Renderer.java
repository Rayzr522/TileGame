package me.rayzr522.tilegame.render;


import me.rayzr522.tilegame.Window;

public class Renderer {
    private final Window window;

    public Renderer(Window window) {
        this.window = window;
    }

    public void fill(Color color) {
        rect(0, 0, window.getWidth(), window.getHeight(), color);
    }

    public void rect(int x, int y, int width, int height, Color color) {
        for (int xx = 0; xx < width; xx++) {
            for (int yy = 0; yy < height; yy++) {
                window.setPixel(x + xx, y + yy, color.toInt());
            }
        }
    }
}
