package rascu.stefan.twitchanalysis.model.streams;

import com.squareup.moshi.Json;

import java.io.Serializable;

public class Channel implements Serializable {

    @Json(name = "_id")
    private long id;

    @Json(name = "broadcaster_language")
    private String broadcaster_language;

    @Json(name = "created_at")
    private String created_at;

    @Json(name = "display_name")
    private String display_name;

    @Json(name = "followers")
    private long followers;

    @Json(name = "game")
    private String game;

    @Json(name = "language")
    private String language;

    @Json(name = "logo")
    private String logo;

    @Json(name = "mature")
    private String mature;

    @Json(name = "name")
    private String name;

    @Json(name = "partner")
    private boolean partner;

    @Json(name = "profile_banner")
    private String profile_banner;

    @Json(name = "profile_banner_background_color")
    private String profile_banner_background_color;

    @Json(name = "status")
    private String status;

    @Json(name = "updated_at")
    private String updated_at;

    @Json(name = "url")
    private String url;

    @Json(name = "video_banner")
    private String video_banner;

    @Json(name = "views")
    private long views;

    public long getId() {
        return id;
    }

    public String getBroadcaster_language() {
        return broadcaster_language;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public long getFollowers() {
        return followers;
    }

    public String getGame() {
        return game;
    }

    public String getLanguage() {
        return language;
    }

    public String isLogo() {
        return logo;
    }

    public String getMature() {
        return mature;
    }

    public String getName() {
        return name;
    }

    public boolean isPartner() {
        return partner;
    }

    public String getProfile_banner() {
        return profile_banner;
    }

    public String getProfile_banner_background_color() {
        return profile_banner_background_color;
    }

    public String getStatus() {
        return status;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getUrl() {
        return url;
    }

    public String getVideo_banner() {
        return video_banner;
    }

    public long getViews() {
        return views;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBroadcaster_language(String broadcaster_language) {
        this.broadcaster_language = broadcaster_language;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public void setFollowers(long followers) {
        this.followers = followers;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setMature(String mature) {
        this.mature = mature;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPartner(boolean partner) {
        this.partner = partner;
    }

    public void setProfile_banner(String profile_banner) {
        this.profile_banner = profile_banner;
    }

    public void setProfile_banner_background_color(String profile_banner_background_color) {
        this.profile_banner_background_color = profile_banner_background_color;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setVideo_banner(String video_banner) {
        this.video_banner = video_banner;
    }

    public void setViews(long views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "id=" + id +
                ", broadcaster_language='" + broadcaster_language + '\'' +
                ", created_at='" + created_at + '\'' +
                ", display_name='" + display_name + '\'' +
                ", followers=" + followers +
                ", game='" + game + '\'' +
                ", language='" + language + '\'' +
                ", logo=" + logo +
                ", mature='" + mature + '\'' +
                ", name='" + name + '\'' +
                ", partner=" + partner +
                ", profile_banner='" + profile_banner + '\'' +
                ", profile_banner_background_color='" + profile_banner_background_color + '\'' +
                ", status='" + status + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", url='" + url + '\'' +
                ", video_banner='" + video_banner + '\'' +
                ", views=" + views +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Channel  channel = (Channel) o;

        return id == channel.id;

    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
