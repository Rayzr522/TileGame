package me.rayzr522.tilegame;

import me.rayzr522.tilegame.render.Color;
import me.rayzr522.tilegame.render.Renderer;
import me.rayzr522.tilegame.resource.sound.SoundManager;
import me.rayzr522.tilegame.world.World;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TileGame implements Runnable {
    private static final int TICK_TIME = 1000 / 60;
    private static TileGame instance;

    private Window window;

    private Logger logger;
    private Renderer renderer;
    private SoundManager soundManager;
    private World world;

    private boolean running = false;
    private long last = System.currentTimeMillis();

    public TileGame(Window window, Graphics2D graphics2D) {
        instance = this;

        this.window = window;

        logger = Logger.getLogger(getClass().toString());
        renderer = new Renderer(window);
        soundManager = new SoundManager();
        world = new World(this);
    }

    public static TileGame getInstance() {
        return instance;
    }

    public Window getWindow() {
        return window;
    }

    public Logger getLogger() {
        return logger;
    }

    public Renderer getRenderer() {
        return renderer;
    }

    public SoundManager getSoundManager() {
        return soundManager;
    }

    public World getWorld() {
        return world;
    }

    public void log(String message, Object... args) {
        logger.info(String.format(message, args));
    }

    public void debug(String message, Object... args) {
        logger.log(Level.FINEST, String.format(message, args));
    }

    public boolean isRunning() {
        return running;
    }

    public void stop() {
        if (!running) {
            throw new IllegalStateException("Game is already stopped!");
        }

        running = false;
    }

    @Override
    public void run() {
        running = true;

        while (running) {
            long now = System.currentTimeMillis();

            tick();
            physics();
            render();
            input();

            long end = System.currentTimeMillis();
            long diff = end - now;

            try {
                Thread.sleep(Math.max(TICK_TIME - diff, 0));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void tick() {

    }

    private void physics() {

    }

    private void render() {
        world.render();

        window.draw();
    }

    private void input() {

    }
}
