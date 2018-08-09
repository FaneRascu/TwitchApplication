package rascu.stefan.twitchanalysis.model.games;

import com.squareup.moshi.Json;

import java.io.Serializable;

public class Game implements Serializable {

    @Json(name = "_id")
    private long id;

    @Json(name = "giantbomb_id")
    private long giantBombId;

    @Json(name = "name")
    private String name;

    @Json(name = "box")
    private GameBox box;

    @Json(name = "logo")
    private GameLogo logo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGiantBombId() {
        return giantBombId;
    }

    public void setGiantBombId(long giantBombId) {
        this.giantBombId = giantBombId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameBox getBox() {
        return box;
    }

    public void setBox(GameBox box) {
        this.box = box;
    }

    public GameLogo getLogo() {
        return logo;
    }

    public void setLogo(GameLogo logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", box=" + box +
                ", logo=" + logo +
                ", giantbombId=" + giantBombId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        return id == game.id;

    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
