package rascu.stefan.twitchanalysis.model.streams;

import com.squareup.moshi.Json;

import java.io.Serializable;

public class TopFeaturedStream implements Serializable {

    @Json(name = "image")
    private String image;

    @Json(name = "priority")
    private int priority;

    @Json(name = "scheduled")
    private boolean scheduled;

    @Json(name = "sponsored")
    private boolean sponsored;

    @Json(name = "stream")
    private Stream stream;

    @Json(name = "text")
    private String text;

    @Json(name = "title")
    private String title;

    int position;

    public String getImage() {
        return image;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isScheduled() {
        return scheduled;
    }

    public boolean isSponsored() {
        return sponsored;
    }

    public Stream getStream() {
        return stream;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setScheduled(boolean scheduled) {
        this.scheduled = scheduled;
    }

    public void setSponsored(boolean sponsored) {
        this.sponsored = sponsored;
    }

    public void setStream(Stream stream) {
        this.stream = stream;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
