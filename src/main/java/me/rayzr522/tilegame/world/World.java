package me.rayzr522.tilegame.world;

import me.rayzr522.tilegame.TileGame;
import me.rayzr522.tilegame.render.Color;
import me.rayzr522.tilegame.render.Renderer;

/**
 * Created by Rayzr522 on 7/17/17.
 */
public class World {
    private TileGame game;

    private Tile[][] tiles = new Tile[30][40];

    public World(TileGame tileGame) {
        this.game = tileGame;

        for (int y = 0; y < tiles.length; y++) {
            for (int x = 0; x < tiles[y].length; x++) {
                tiles[y][x] = new Tile();
            }
        }
    }

    public void render() {
        Renderer renderer = game.getRenderer();

        for (int y = 0; y < tiles.length; y++) {
            Tile[] row = tiles[y];
            for (int x = 0; x < row.length; x++) {
                Tile tile = row[x];
                renderer.rect(x * 20, y * 20, tile.getWidth(), tile.getHeight(), new Color(x * 2 + y * 3, 0, 0));
            }
        }
    }
}
