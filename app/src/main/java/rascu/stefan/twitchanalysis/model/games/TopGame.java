package rascu.stefan.twitchanalysis.model.games;

import com.squareup.moshi.Json;

import java.io.Serializable;

public class TopGame implements Serializable {

    @Json(name = "viewers")
    private long viewers;

    @Json(name = "channels")
    private int channels;

    @Json(name = "game")
    private Game game;

    private int position;

    public long getViewers() {
        return viewers;
    }

    public void setViewers(long viewers) {
        this.viewers = viewers;
    }

    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}