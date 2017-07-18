package me.rayzr522.tilegame.resource.sound;

import me.rayzr522.tilegame.TileGame;
import me.rayzr522.tilegame.resource.Resource;

/**
 * Created by Rayzr522 on 7/17/17.
 */
public class Sound extends Resource {

    public Sound(String path) {
        super(path);
    }

    @Override
    public void load() {
        TileGame.getInstance().debug("Loading sound at '%s'", getPath());
    }
}
