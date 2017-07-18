package me.rayzr522.tilegame.render;

public class Color {
    private int r;
    private int g;
    private int b;
    // private int a; maybe?


    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public static Color fromInt(int input) {
        return new Color((input >> 16), (input >> 8) & 0xFF, input & 0xFF);
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public int toInt() {
        return (r << 16) | (g << 8) | b;
    }

    @Override
    public String toString() {
        return "Color{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }
}
