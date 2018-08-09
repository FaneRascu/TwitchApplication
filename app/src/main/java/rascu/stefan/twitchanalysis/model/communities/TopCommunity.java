package rascu.stefan.twitchanalysis.model.communities;

import com.squareup.moshi.Json;

import java.io.Serializable;
import java.util.Objects;

public class TopCommunity implements Serializable {

    @Json(name = "avtar_image_url")
    private String avatarImageURL;

    @Json(name = "channels")
    private long channels;

    @Json(name = "id")
    private String id;

    @Json(name = "name")
    private String name;

    @Json(name = "viewers")
    private long viewers;

    private int position;

    public String getAvatarImageURL() {
        return avatarImageURL;
    }

    public long getChannels() {
        return channels;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getViewers() {
        return viewers;
    }

    public void setAvatarImageURL(String avatarImageURL) {
        this.avatarImageURL = avatarImageURL;
    }

    public void setChannels(long channels) {
        this.channels = channels;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setViewers(long viewers) {
        this.viewers = viewers;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "TopCommunity{" +
                "avatarImageURL='" + avatarImageURL + '\'' +
                ", channels=" + channels +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", viewers=" + viewers +
                '}';
    }
}
