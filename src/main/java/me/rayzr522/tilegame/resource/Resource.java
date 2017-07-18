package me.rayzr522.tilegame.resource;

/**
 * Created by Rayzr522 on 7/17/17.
 */
public abstract class Resource {
    private String path;

    public Resource(String path) {
        this.path = path;
        load();
    }

    public abstract void load();

    public String getPath() {
        return path;
    }
}
